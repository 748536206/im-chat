package com.instant.tio.packet;

/**
 * 单聊信息发送包，客户端发送过来的包 ChatRequestBody 转化为 ImToClientChatMsgBody
 * 转化方法: packet.convert.BodyConvert.convertToClientMsgBody
 */
public class ImToClientChatMsgBody extends ImBaseBody {
    private String from;
    private String id;
    private String avatar;
    private String content;
    private String username;
    private String type;
    private String toId;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    @Override
    public String toString() {
        return "ImToClientChatMsgBody{" +
                "from='" + from + '\'' +
                ", id='" + id + '\'' +
                ", avatar='" + avatar + '\'' +
                ", content='" + content + '\'' +
                ", username='" + username + '\'' +
                ", type='" + type + '\'' +
                ", toId='" + toId + '\'' +
                '}';
    }
}
