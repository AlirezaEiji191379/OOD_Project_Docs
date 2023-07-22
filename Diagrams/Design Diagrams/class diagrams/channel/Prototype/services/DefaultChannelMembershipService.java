package org.example.channel.services;

import org.example.channel.context.MembershipRequest;
import org.example.channel.entities.ChannelMemberEntity;
import org.example.channel.entities.enums.Role;
import org.example.channel.repositories.ChannelMembersRepository;
import org.example.channel.repositories.ChannelPremiumUsersRepository;
import org.example.channel.repositories.ChannelRepository;
import org.example.channel.services.contracts.ChannelMembershipService;
import org.example.user.UserFacade;
import org.example.user.context.Response;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DefaultChannelMembershipService implements ChannelMembershipService {

    private final ChannelPremiumUsersRepository channelPremiumUsersRepository;
    private final ChannelMembersRepository membersRepository;
    private final ChannelRepository channelRepository;

    public DefaultChannelMembershipService(ChannelPremiumUsersRepository channelPremiumUsersRepository, ChannelMembersRepository membersRepository, ChannelRepository channelRepository) {
        this.channelPremiumUsersRepository = channelPremiumUsersRepository;
        this.membersRepository = membersRepository;
        this.channelRepository = channelRepository;
    }

    @Override
    public Response joinChannel(String joinLink) {
        new UserFacade().getCurrentUser().getUserId();
        membersRepository.findByUserIdAndChannelId(10, channelRepository.findByJoinLink("").getId());

    }

    @Override
    public Response addAdminToChannel(MembershipRequest request) {
        for (int adminId : request.getAdminIds()) {
            membersRepository.findByUserIdAndChannelId(10, channelRepository.findByJoinLink("").getId());
            new ChannelMemberEntity().setRole(Role.ADMIN);
        }
    }

    @Override
    public Response showMembers(int channelId) {
        membersRepository.findByChannelId(channelId);
        new UserFacade().getUser(10).getName()
        new UserFacade().getUser(10).getPicturePath()
    }

    @Override
    public Response removeMember(MembershipRequest request) {
        new UserFacade().getCurrentUser();
        membersRepository.findByUserIdAndChannelId(10, 12);
        for (int memberId : request.getMemberIds()) {
            membersRepository.findByUserIdAndChannelId(memberId, 10);
            checkroles;
            membersRepository.delete(memberId, 10);
        }
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
    }

    @Override
    public Response showAdmins(int channelId) {
        int userId = new UserFacade().getCurrentUserId();
        if (this.isAdmin(userId, channelId) || this.isOwner(userId, channelId)) {
            var admins = membersRepository.findByChannelIdAndRole(
                    channelId, Arrays.asList(Role.ADMIN, Role.OWNER)
            );
            admins.stream().map(admin -> new UserFacade().retrieveNameAndPicture(admin.getUserId()));
        }
        return new Response();
    }

    @Override
    public Response removeAdmins(MembershipRequest request) {
        int userId = new UserFacade().getCurrentUserId();
        if (this.isOwner(userId, request.getChannelId())) {
            request.getAdminIds().forEach(adminId -> {
                var user = membersRepository.findByUserIdAndChannelId(adminId, channelId);
                user.setRole(Role.MEMBER);
                membersRepository.save(user);
            });
        }
        return new Response();
    }

    @Override
    public boolean isAdmin(int channelId, int userId) {
        return Objects.nonNull(membersRepository.find(
                userId, channelId, Arrays.asList(Role.ADMIN)
        ));
    }

    @Override
    public boolean isOwner(int channelId, int userId) {
        return Objects.nonNull(membersRepository.find(
                userId, channelId, List.of(Role.OWNER)
        ));
    }
}
