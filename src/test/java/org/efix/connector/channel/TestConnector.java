package org.efix.connector.channel;

import org.efix.connector.ConnectionException;
import org.efix.connector.Connector;


public class TestConnector implements Connector {

    protected final Channel channel;

    public TestConnector(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void initiateConnect() throws ConnectionException {

    }

    @Override
    public Channel finishConnect() throws ConnectionException {
        return channel;
    }

    @Override
    public void disconnect() throws ConnectionException {

    }

    @Override
    public boolean isConnectionInitiated() {
        return true;
    }

    @Override
    public boolean isConnectionPending() {
        return true;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

}
