package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request20 extends Request4All {

    public static final byte MESSAGE_CODE=Telegram.TELEGA20;
    public static final int MESSAGE_LENGHT=8;

    public byte msgSTX      = 0x02;
    public byte msgETX      = 0x03;
    public byte Command     = MESSAGE_CODE;
    public byte[] Reserve    = new byte[4];
    public byte ExitNumber  = 0x32;

    public void setExitNumber(byte ExitNumber) {
        this.ExitNumber=ExitNumber;
    }

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        msgSTX     = msg.readByte();
        Command    = msg.readByte();
        ExitNumber = msg.readByte();
        byte[] Array = new byte[4];
        msg.readBytes(Array);
        Reserve = Array;
        msgETX     = msg.readByte();

    }
    @Override
    public String toString() {
        String NewString = " ExitNumber->"+ExitNumber;
        return super.toString()+NewString;
    }       
}
