package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Response18 extends Request4All {

    //Метод отвечает за отправку информации на сортировщик что в выход
    //загружен новый мешок и выход можно открыт
    public static final byte MESSAGE_CODE  = 0x18;
    public static final int MESSAGE_LENGHT = 8;


    public byte msgSTX      = 0x02;
    public byte msgETX      = 0x03;
    public byte Command     = MESSAGE_CODE;
    public byte[] Reserve     = new byte[4];
    public byte ExitNumber  = 0x32;

    public void setExitNumber(byte ExitNumber) {
        this.ExitNumber=ExitNumber;
    }

    public  byte getExitNumber() {
        return ExitNumber;
    }

    @Override
    public ByteBuf ToByte() {
        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(msgSTX);
        buf.writeByte(MESSAGE_CODE);
        buf.writeByte(ExitNumber);
        buf.writeBytes(Reserve);
        buf.writeByte(msgETX);

        return buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        msgSTX     = msg.readByte();
        Command    = msg.readByte();
        ExitNumber = msg.readByte();
        byte[] Array = new byte[4];
        msg.readBytes(Array);
        Reserve    = Array;
        msgETX     = msg.readByte();

    }
    @Override
    public String toString() {
        String NewString = " ExitNumber->"+ExitNumber;
        return super.toString()+NewString;
    }      
}
