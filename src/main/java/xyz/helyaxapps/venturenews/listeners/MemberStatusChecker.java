package xyz.helyaxapps.venturenews.listeners;


import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.user.UserOnlineStatusUpdateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MemberStatusChecker extends ListenerAdapter
{

    @Override

    public void onUserOnlineStatusUpdate(UserOnlineStatusUpdateEvent event)
    {

        super.onUserOnlineStatusUpdate(event);

        if (event.getGuild().getMemberById("249225518077968384").getOnlineStatus() == OnlineStatus.OFFLINE)
        {
            event.getGuild().getTextChannelById("356075105509572608").sendMessage("You've gone offline!").queue();
        }

    }
}