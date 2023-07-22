package org.example.channel.services.contracts;

import org.example.channel.context.MembershipRequest;
import org.example.user.context.Response;

import java.util.List;

public interface ChannelMembershipService {
    Response joinChannel(String joinLink);

    Response addAdminToChannel(MembershipRequest request);

    Response showMembers(int channelId);

    Response removeMember(MembershipRequest request);

    Response setIncomeShare(MembershipRequest request);

    Response showAdmins(int channelId);

    Response removeAdmins(MembershipRequest request);

    boolean isAdmin(int channelId, int userId);

    boolean isOwner(int channelId, int userId);
}
