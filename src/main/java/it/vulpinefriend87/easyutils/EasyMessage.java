package it.vulpinefriend87.easyutils;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class EasyMessage {
    private final TextComponent textComponent;

    public EasyMessage(String message) {
        textComponent = new TextComponent(Colorize.color(message));
    }

    public void setClickable(ClickEvent.Action action, String value) {
        ClickEvent clickEvent = new ClickEvent(action, Colorize.color(value));
        textComponent.setClickEvent(clickEvent);
    }

    public void setHoverable(HoverEvent.Action action, String value) {
        TextComponent hoverText = new TextComponent(value);
        HoverEvent hoverEvent = new HoverEvent(action, new net.md_5.bungee.api.chat.hover.content.Text(hoverText));
        textComponent.setHoverEvent(hoverEvent);
    }

    public TextComponent getTextComponent() {
        return textComponent;
    }
}
