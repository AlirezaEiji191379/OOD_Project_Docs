package channel.services;

import channel.context.MembershipRequest;
import channel.entities.ChannelMemberEntity;
import channel.entities.enums.Role;
import channel.repositories.contracts.ChannelMembersRepository;
import channel.repositories.contracts.ChannelPremiumUsersRepository;
import channel.repositories.contracts.ChannelRepository;
import channel.services.contracts.ChannelMembershipService;
import user.UserFacade;
import core.library.context.Response;

import java.util.Arrays;
import java.util.Objects;

public class DefaultChannelMembershipService implements ChannelMembershipService {

    private ChannelPremiumUsersRepository channelPremiumUsersRepository;
    private ChannelMembersRepository membersRepository;
    private ChannelRepository channelRepository;
    private UserFacade userFacade;

    public DefaultChannelMembershipService() {}

    @Override
    public Response joinChannel(String joinLink) {
        userFacade.getCurrentUser().getUserId();
        membersRepository.findByUserIdAndChannelId(10, channelRepository.findByJoinLink("").getId());
        return new Response();
    }

    @Override
    public Response addAdminToChannel(MembershipRequest request) {
        for (int adminId : request.getAdminIds()) {
            membersRepository.findByUserIdAndChannelId(10, channelRepository.findByJoinLink("").getId());
            new ChannelMemberEntity().setRole(Role.ADMIN);
        }
        return new Response();
    }

    @Override
    public Response showMembers(int channelId) {
        membersRepository.findByChannelId(channelId);
        userFacade.getUser(10).getName();
        userFacade.getUser(10).getPicturePath();
        return new Response();
    }

    @Override
    public Response removeMember(MembershipRequest request) {
        userFacade.getCurrentUser();
        membersRepository.findByUserIdAndChannelId(10, 12);
        for (int memberId : request.getMemberIds()) {
            membersRepository.findByUserIdAndChannelId(memberId, 10);
//            checkroles;
            membersRepository.delete(new ChannelMemberEntity());
        }
        return new Response();
    }

    @Override
    public Response setIncomeShare(MembershipRequest request) {
        request.getIncomeShares().forEach((integer, aDouble) -> {
            //check access
            membersRepository.findByChannelIdAndRole(10, Role.ADMIN);
            membersRepository.findByChannelIdAndRole(10, Role.OWNER);
            //check sum 100
            //add
        });
        return new Response();
    }

    @Override
    public Response showAdmins(int channelId) {
        int userId = userFacade.getCurrentUser().getUserId();
        if (this.isAdmin(userId, channelId) || this.isOwner(userId, channelId)) {
            var admins = membersRepository.findByChannelIdAndRole(
                    channelId, Role.ADMIN, Role.OWNER
            );
            Arrays.stream(admins).map(admin -> userFacade.getUser(admin.getUserId()));
        }
        return new Response();
    }

    @Override
    public Response removeAdmins(MembershipRequest request) {
        int userId = userFacade.getCurrentUser().getUserId();
        if (this.isOwner(userId, request.getChannelId())) {
            for (int adminId : request.getAdminIds()) {
                var user = membersRepository.findByUserIdAndChannelId(adminId, request.getChannelId());
                user.setRole(Role.MEMBER);
                membersRepository.save(user);
            }
        }
        return new Response();
    }

    @Override
    public boolean isAdmin(int channelId, int userId) {
        return Objects.nonNull(membersRepository.find(
                userId, channelId, Role.ADMIN
        ));
    }

    @Override
    public boolean isOwner(int channelId, int userId) {
        return Objects.nonNull(membersRepository.find(
                userId, channelId, Role.OWNER
        ));
    }
}
