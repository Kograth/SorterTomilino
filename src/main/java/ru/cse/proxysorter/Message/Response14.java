package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Response14 extends Request4All {

    public static final byte MESSAGE_CODE=Telegram.TELEGA14;
    public static final int MESSAGE_LENGHT=8;


    public byte msgSTX      = 0x02;
    public byte msgETX      = 0x03;
    public short Source     = 0x31;
    private int codeProduct = 41;


    public void SetSource(short Source) {
        this.Source = Source;
    }

    public void SetCodeProduct (int CodeProduct) {
        this.codeProduct = CodeProduct;
    }

    @Override
    public ByteBuf ToByte() {

        ByteBuf buf = Unpooled.buffer(MESSAGE_LENGHT);
        buf.writeByte(msgSTX);
        buf.writeByte(MESSAGE_CODE);
        buf.writeInt(codeProduct);
        buf.writeByte(Source);
        buf.writeByte(msgETX);


        return buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {



    }
    @Override
    public String toString() {
        String NewString = " codeProduct->"+codeProduct+" Source->"+Source;
        return super.toString()+NewString;
    }     
}
