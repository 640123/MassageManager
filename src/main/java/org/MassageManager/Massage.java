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
                    .plus("��ӭʹ��MassageManager�����\n����Mirai-console2.7.0����\n�����ߣ�Bert����ɳ�Wutzu��\n��ǰ����汾������1.0\n��ǰ�������ȣ�\nhelloģ�飺�����\n����ģ�飺������\n����ģ�飺������\n��������ڿ�Դ��Ŀ\n��Դ���ַ��"));
        }
    }
}
