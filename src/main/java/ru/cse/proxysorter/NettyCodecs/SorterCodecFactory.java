/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.NettyCodecs;

import io.netty.channel.ChannelHandler;

/**
 *
 * @author Oleynik
 */
public final class SorterCodecFactory  {

    private SorterCodecFactory() {
        
        
    }

    public static ChannelHandler createDecoderSorterTlg() {

        return new DecoderSorterTlg();
    }
    public static ChannelHandler createEncoderSorterTlg() {
        return new EncoderSorterTlg();
    }

}

