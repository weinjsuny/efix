package org.f1x.connector;

import org.f1x.connector.channel.NioSocketChannel;
import org.f1x.connector.channel.SocketOptions;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.Channel;
import java.nio.channels.SocketChannel;

public abstract class SocketChannelConnector implements Connector {

    protected final SocketAddress address;
    protected final SocketOptions options;

    protected SocketChannel channel;
    protected NioSocketChannel nioChannel;

    public SocketChannelConnector(SocketAddress address, SocketOptions options) {
        this.address = address;
        this.options = options;
    }

    @Override
    public org.f1x.connector.channel.Channel connect() throws ConnectionException {
        if (!isConnected())
            doConnect();

        return nioChannel;
    }

    @Override
    public void disconnect() {
        closeChannel(channel);
        channel = null;
        nioChannel = null;
    }

    @Override
    public boolean isConnectionPending() {
        return channel != null && nioChannel == null;
    }

    @Override
    public boolean isConnected() {
        return nioChannel != null;
    }

    protected abstract void doConnect();

    protected void configure(SocketChannel channel) throws IOException {
        channel.configureBlocking(false);
        for (int i = 0; i < options.size(); i++)
            setOption(options.get(i), channel);
    }

    protected static <T> void setOption(SocketOptions.Entry<T> entry, SocketChannel channel) throws IOException {
        channel.setOption(entry.option(), entry.value());
    }

    protected static void closeChannel(Channel channel) {
        if (channel != null) {
            try {
                channel.close();
            } catch (IOException e) {
                throw new ConnectionException(e);
            }
        }
    }

}