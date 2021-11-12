package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Response22 extends Request4All{

    public static final short MESSAGE_CODE=Telegram.TELEGA22;
    public static final int MESSAGE_LENGHT=9;


    private short Command       = MESSAGE_CODE;
    public byte msgSTX         = 0x02;
    public byte msgETX         = 0x03;
    private short codeProduct     = 0;
    private int Status          = 0;
    private int Reserv          = 0;
public byte[] bytes;
    //private short ExitNumber = 0x04;

    public short getCommand() {
        return Command;
    }

    public void setCommand(short Command) {
        this.Command = Command;
    }

    public void setCodeProduct(short codeProduct) {
        this.codeProduct = codeProduct;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }




    @Override
    public ByteBuf ToByte() {


        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(msgSTX);
        buf.writeByte(MESSAGE_CODE);
        buf.writeShort(codeProduct);
        buf.writeShort(Status);
        buf.writeShort(Reserv);
        buf.writeByte(msgETX);
        byte[] bytes = new byte[buf.readableBytes()];
        String leg = bytes.toString();
        return  buf;

    }

    @Override
    public void FromByte(ByteBuf msg) {

       /* msgSTX = msg.readByte();
        Command = msg.readByte();
        codeProduct = msg.readShort();
        Status = msg.readInt();
        Reserv = msg.readInt();
        msgETX = msg.readByte();*/

    }

}



