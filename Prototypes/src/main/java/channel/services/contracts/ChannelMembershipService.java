package channel.services.contracts;

import channel.context.MembershipRequest;
import core.library.context.Response;

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
