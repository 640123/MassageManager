package org.MassageManager;

import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.message.data.At;
import net.mamoe.mirai.message.data.MessageChain;
import net.mamoe.mirai.message.data.MessageUtils;
import net.mamoe.mirai.event.events.GroupMessageEvent;

import java.util.function.Consumer;

public class Massage implements Consumer <GroupMessageEvent> {
    @Override
    public void accept(GroupMessageEvent event){
        event.getMessage();
        if (event.getMessage() == MessageChain.deserializeFromJsonString(".hello")){
            event.getGroup().sendMessage(MessageUtils.newChain(new At(event.getSender().getId()))
                    .plus("欢迎使用MassageManager插件！\n基于Mirai-console2.7.0开发\n开发者：Bert（亦可称Wutzu）\n当前插件版本：快照1.0\n当前开发进度：\nhello模块：已完成\n撤回模块：开发中\n禁言模块：开发中\n本插件属于开源项目\n开源库地址："));
        }
    }
}
