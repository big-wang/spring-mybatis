package com.wangbr.nio.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

public class PrintOutboundMsgHandler extends ChannelOutboundHandlerAdapter {

    @Override
    public void bind(ChannelHandlerContext ctx, SocketAddress localAddress, ChannelPromise promise) throws Exception {
        System.out.println("bind in PrintOutboundMsgHandler");
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        System.out.println("----PrintOutboundMsgHandler----");
        ctx.writeAndFlush("write in PrintOutboundMsgHandler");
    }
}
