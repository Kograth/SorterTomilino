package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Request19 extends Request4All {

    public static final byte MESSAGE_CODE=Telegram.TELEGA19;
    public static final int MESSAGE_LENGHT=9;

    private short msgSTX            = 0x02;
    private short Command           = MESSAGE_CODE;
    private byte ExitNumber        = 0x31;
    private byte[] Reserv          = new byte[5];
    private short msgETX           = 0x03;


    public byte getExitNumber() {
        return ExitNumber;
    }

    @Override
    public ByteBuf ToByte() {
        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(getSmlSTX());
        buf.writeByte(getCommand());
        buf.writeByte(getExitNumber());
        buf.writeBytes(getReserv());
        buf.writeByte(getSmlETX());
        return buf;

    }

    public short getSmlSTX() {
        return msgSTX;
    }

    public short getCommand() {
        return Command;
    }

    public byte[] getReserv() {
        return Reserv;
    }
    public short getSmlETX() {
        return msgETX;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        msgSTX          = msg.readByte();
        Command         = msg.readByte();
        ExitNumber      = msg.readByte();
        msg.readBytes(Reserv);
        msgETX          = msg.readUnsignedByte();

    }
    @Override
    public String toString() {
        String NewString = " ExitNumber->"+ExitNumber;
        return super.toString()+NewString;
    }         
}
