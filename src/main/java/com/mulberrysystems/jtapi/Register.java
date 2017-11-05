package com.mulberrysystems.jtapi;

import javax.telephony.*;
import javax.telephony.callcontrol.*;
import java.util.function.Consumer;

public class Register {


    public void registerAddress(javax.telephony.Provider provider, String name, Consumer<Event> consumer) throws Exception{
        Address address = provider.getAddress(name);
        address.addCallListener(new MyCallControlListener(consumer));
    }

    public void registerTerminal(Provider provider, String name, Consumer<Event> consumer) throws Exception {
        Terminal terminal = provider.getTerminal(name);
        terminal.addCallListener(new MyCallControlTerminalListener(consumer));
    }
    public class MyCallControlListener implements CallControlConnectionListener {

        private Consumer<Event> consumer;

        public MyCallControlListener(Consumer<Event> consumer) {
            this.consumer = consumer;
        }

        public void connectionAlerting(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionDialing(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionDisconnected(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionEstablished(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionFailed(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionInitiated(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionNetworkAlerting(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionNetworkReached(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionOffered(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionQueued(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionUnknown(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        public void connectionAlerting(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void connectionConnected(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void connectionCreated(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void connectionDisconnected(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void connectionFailed(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void connectionInProgress(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void connectionUnknown(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        public void callActive(CallEvent callEvent) {
            consumer.accept(callEvent);
        }

        public void callInvalid(CallEvent callEvent) {
            consumer.accept(callEvent);
        }

        public void callEventTransmissionEnded(CallEvent callEvent) {
            consumer.accept(callEvent);
        }

        public void singleCallMetaProgressStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void singleCallMetaProgressEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void singleCallMetaSnapshotStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void singleCallMetaSnapshotEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void multiCallMetaMergeStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void multiCallMetaMergeEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void multiCallMetaTransferStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        public void multiCallMetaTransferEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

    }

    public class MyCallControlTerminalListener implements CallControlTerminalConnectionListener {

        private Consumer<Event> consumer;

        public MyCallControlTerminalListener(Consumer<Event> consumer) {
            this.consumer = consumer;
        }
        @Override
        public void terminalConnectionBridged(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionDropped(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionHeld(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionInUse(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionRinging(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionTalking(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionUnknown(CallControlTerminalConnectionEvent callControlTerminalConnectionEvent) {
            consumer.accept(callControlTerminalConnectionEvent);
        }

        @Override
        public void terminalConnectionActive(TerminalConnectionEvent terminalConnectionEvent) {
            consumer.accept(terminalConnectionEvent);
        }

        @Override
        public void terminalConnectionCreated(TerminalConnectionEvent terminalConnectionEvent) {
            consumer.accept(terminalConnectionEvent);
        }

        @Override
        public void terminalConnectionDropped(TerminalConnectionEvent terminalConnectionEvent) {
            consumer.accept(terminalConnectionEvent);
        }

        @Override
        public void terminalConnectionPassive(TerminalConnectionEvent terminalConnectionEvent) {
            consumer.accept(terminalConnectionEvent);
        }

        @Override
        public void terminalConnectionRinging(TerminalConnectionEvent terminalConnectionEvent) {
            consumer.accept(terminalConnectionEvent);
        }

        @Override
        public void terminalConnectionUnknown(TerminalConnectionEvent terminalConnectionEvent) {
            consumer.accept(terminalConnectionEvent);
        }

        @Override
        public void connectionAlerting(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionDialing(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionDisconnected(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionEstablished(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionFailed(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionInitiated(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionNetworkAlerting(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionNetworkReached(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionOffered(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionQueued(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionUnknown(CallControlConnectionEvent callControlConnectionEvent) {
            consumer.accept(callControlConnectionEvent);
        }

        @Override
        public void connectionAlerting(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void connectionConnected(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void connectionCreated(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void connectionDisconnected(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void connectionFailed(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void connectionInProgress(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void connectionUnknown(ConnectionEvent connectionEvent) {
            consumer.accept(connectionEvent);
        }

        @Override
        public void callActive(CallEvent callEvent) {
            consumer.accept(callEvent);
        }

        @Override
        public void callInvalid(CallEvent callEvent) {
            consumer.accept(callEvent);
        }

        @Override
        public void callEventTransmissionEnded(CallEvent callEvent) {
            consumer.accept(callEvent);
        }

        @Override
        public void singleCallMetaProgressStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        @Override
        public void singleCallMetaProgressEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);

        }

        @Override
        public void singleCallMetaSnapshotStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        @Override
        public void singleCallMetaSnapshotEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        @Override
        public void multiCallMetaMergeStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        @Override
        public void multiCallMetaMergeEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        @Override
        public void multiCallMetaTransferStarted(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }

        @Override
        public void multiCallMetaTransferEnded(MetaEvent metaEvent) {
            consumer.accept(metaEvent);
        }
    }

    public class MyCallControlAddressListener implements CallControlAddressListener {

        @Override
        public void addressDoNotDisturb(CallControlAddressEvent callControlAddressEvent) {

        }

        @Override
        public void addressForwarded(CallControlAddressEvent callControlAddressEvent) {

        }

        @Override
        public void addressMessageWaiting(CallControlAddressEvent callControlAddressEvent) {

        }

        @Override
        public void addressListenerEnded(AddressEvent addressEvent) {

        }
    }

}
