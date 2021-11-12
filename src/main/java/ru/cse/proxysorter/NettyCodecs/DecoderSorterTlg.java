/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.NettyCodecs;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

import ru.cse.proxysorter.Message.*;

/**
 *
 * @author Oleynik
 */
@ChannelHandler.Sharable
public class DecoderSorterTlg extends  MessageToMessageDecoder<ByteBuf>  {
static final int MAX_PACKET_LENGHT=1024;
static final int IN_BYTE_TYPE_MSG=1;
//static final  byte[] Re = {0x02,0x11,0x31,0x32,0x39,0x39};

    public static byte msgType;

    @Override
    protected void decode(ChannelHandlerContext chc, ByteBuf msg, List<Object> list) throws Exception {
        //byte msgType;
        Request4All newPacket;
        int lenghtMsg=msg.readableBytes();

        if (lenghtMsg>MAX_PACKET_LENGHT) {
           throw new Exception("Превышен размер пакета данных");
        }
        msg.markReaderIndex();        
        
        if (lenghtMsg<=MAX_PACKET_LENGHT && lenghtMsg>=IN_BYTE_TYPE_MSG+1) {
            msgType = msg.getByte(IN_BYTE_TYPE_MSG);
            if (Request11.MESSAGE_CODE == msgType & lenghtMsg>=Request11.MESSAGE_LENGHT) {
                //надо вычитать данные
                newPacket = (Request11) new Request11();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }
            if (Request13.MESSAGE_CODE==msgType & lenghtMsg>=Request13.MESSAGE_LENGHT) {
                newPacket = (Request13) new Request13();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }
            if (Request15.MESSAGE_CODE==msgType & lenghtMsg>=Request15.MESSAGE_LENGHT) {
                newPacket = (Request15) new Request15();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }

            if (Request17.MESSAGE_CODE==msgType) {
                newPacket = (Request17) new Request17();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }
            if (Request111.MESSAGE_CODE==msgType) {
                newPacket = (Request111) new Request111();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }
            if (Request19.MESSAGE_CODE==msgType) {
                newPacket = (Request19) new Request19();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }
            if(Request20.MESSAGE_CODE==msgType) {
                newPacket = (Request20) new Request20();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }
            if (Response18.MESSAGE_CODE==msgType) {
                newPacket = (Response18) new Response18();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }

            if (Response22.MESSAGE_CODE==msgType) {
                newPacket = (Response22) new Response22();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }

            if (Request21.MESSAGE_CODE==msgType) {
                newPacket = (Request21) new Request21();
                newPacket.FromByte(msg);
                list.add(newPacket);
            }

            else
            {            
                msg.resetReaderIndex();
            }
        }
    }

    public static byte getMsgType() {
        return msgType;
    }
}
