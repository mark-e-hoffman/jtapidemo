package com.mulberrysystems.jtapi;


import net.sourceforge.gjtapi.FreeCall;
import org.junit.Test;

import javax.telephony.*;
import javax.telephony.callcontrol.CallControlCall;
import javax.telephony.events.ConnAlertingEv;
import javax.telephony.events.ConnConnectedEv;
import javax.telephony.events.ConnCreatedEv;
import javax.telephony.events.TermConnActiveEv;
import java.io.Console;


public class TestRegister {

    @Test
    public void testRegisterAddress() throws Exception{



        String initString = "Asterisk; Server=127.0.0.1; Port=5038; User=mark; Password=mysecret; Context=default;ConferenceContext=custom-meetme";
        JtapiPeer peer = JtapiPeerFactory.getJtapiPeer("");
        Provider provider = peer.getProvider(initString);
        Register register = new Register();
        register.registerAddress(provider, "23", (e) -> {
            System.err.println(e);
            if ( e instanceof ConnConnectedEv) {
                ConnConnectedEv  event = (ConnConnectedEv) e;
                System.err.println(event.getConnection().getAddress().getName());
            } else if ( e instanceof ConnCreatedEv) {
                ConnCreatedEv  event = (ConnCreatedEv) e;
                System.err.println(event.getConnection().getAddress().getName());
            } else if ( e instanceof ConnAlertingEv) {

            }


        });

        Thread.sleep(200000);
    }


    @Test
    public void testRegisterTerminal() throws Exception{
        JtapiPeer peer = JtapiPeerFactory.getJtapiPeer("");
        Provider provider = peer.getProvider("Emulator");
        Register register = new Register();
        register.registerTerminal(provider, "23", (e) -> {
            System.err.println(e);
            if ( e instanceof ConnConnectedEv) {
                ConnConnectedEv  event = (ConnConnectedEv) e;

                for ( int i = 0;i< event.getConnection().getTerminalConnections().length;i++ ) {
                    System.err.println("23,tc:"+ i + "," + event.getConnection().getTerminalConnections()[i]);
                    System.err.println("23,tc-name:" + event.getConnection().getTerminalConnections()[i].getTerminal().getName());
                }

                System.err.println(event.getConnection().getAddress().getName());
            } else if ( e instanceof ConnCreatedEv) {
                ConnCreatedEv  event = (ConnCreatedEv) e;
                System.err.println(event.getConnection().getAddress().getName());
            } else if ( e instanceof TermConnActiveEv) {
                TermConnActiveEv event = ( TermConnActiveEv) e;
                Call call  = ((TermConnActiveEv) e).getCall();
                CallControlCall callControlCall  = ( CallControlCall) call;
               System.err.println("23,calling = " + callControlCall.getCallingAddress().getName());
               System.err.println("23,called = " + callControlCall.getCalledAddress().getName());
               // System.err.println(event.getTerminalConnection().getConnection().getCall().getCallListeners());
            }


        });

        register.registerTerminal(provider, "21", (e) -> {
            System.err.println(e);
            if ( e instanceof ConnConnectedEv) {
                ConnConnectedEv  event = (ConnConnectedEv) e;

                for ( int i = 0;i< event.getConnection().getTerminalConnections().length;i++ ) {
                    System.err.println("21,tc:"+ i + "," + event.getConnection().getTerminalConnections()[i]);
                    System.err.println("21,tc-name:" + event.getConnection().getTerminalConnections()[i].getTerminal().getName());
                }

                System.err.println(event.getConnection().getAddress().getName());
            } else if ( e instanceof ConnCreatedEv) {
                ConnCreatedEv  event = (ConnCreatedEv) e;
                System.err.println(event.getConnection().getAddress().getName());
            } else if ( e instanceof TermConnActiveEv) {
                TermConnActiveEv event = ( TermConnActiveEv) e;
                Call call  = ((TermConnActiveEv) e).getCall();
                CallControlCall callControlCall  = ( CallControlCall) call;
                System.err.println("21,calling = " + callControlCall.getCallingAddress().getName());
                System.err.println("21,called = " + callControlCall.getCalledAddress().getName());
            }


        });

        Thread.sleep(200000);
    }
}
