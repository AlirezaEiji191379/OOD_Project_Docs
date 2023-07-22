package org.example.channel.services;

import org.example.channel.context.ChannelRequest;
import org.example.channel.entities.ChannelEntity;
import org.example.channel.repositories.ChannelMembersRepository;
import org.example.channel.repositories.ChannelRepository;
import org.example.channel.services.contracts.ChannelMembershipService;
import org.example.channel.services.contracts.ChannelService;
import org.example.user.UserFacade;
import org.example.user.context.Response;

import java.util.Objects;

public class DefaultChannelService implements ChannelService {

    private final ChannelRepository channelRepository;
    private final ChannelMembersRepository channelMembersRepository;
    private final ChannelMembershipService membershipService;

    public DefaultChannelService(ChannelRepository channelRepository, ChannelMembersRepository channelMembersRepository, ChannelMembershipService membershipService) {
        this.channelRepository = channelRepository;
        this.channelMembersRepository = channelMembersRepository;
        this.membershipService = membershipService;
    }

    @Override
    public Response showChannelsList() {
        channelRepository.findAll();
        return new Response();
    }

    @Override
    public Response createChannel(String name) {
        Objects.isNull(channelRepository.findByName(name));
        channelRepository.save(new ChannelEntity());
        return new Response();
    }

    @Override
    public Response editChannelDetails(ChannelRequest request) {
        membershipService.isOwner(request.getChannelId(), new UserFacade().getCurrentUser().getUserId());
        membershipService.isAdmin(request.getChannelId(), new UserFacade().getCurrentUser().getUserId());
        channelRepository.findById(request.getChannelId());
        //validate name
        channelRepository.save(new ChannelEntity());
        return new Response();
    }

    @Override
    public Response deleteChannel(int channelId) {
        membershipService.isOwner(channelId, new UserFacade().getCurrentUser().getUserId());
        channelMembersRepository.findByChannelId(channelId);
        channelMembersRepository.delete(10, 11);
        return new Response();
    }
}
