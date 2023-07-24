package channel.services;

import channel.context.ChannelRequest;
import channel.entities.ChannelEntity;
import channel.entities.ChannelMemberEntity;
import channel.repositories.contracts.ChannelMembersRepository;
import channel.repositories.contracts.ChannelRepository;
import channel.services.contracts.ChannelMembershipService;
import channel.services.contracts.ChannelService;
import user.UserFacade;
import core.library.context.Response;

import java.util.Objects;

public class DefaultChannelService implements ChannelService {

    private ChannelRepository channelRepository;
    private ChannelMembersRepository channelMembersRepository;
    private ChannelMembershipService membershipService;

    public DefaultChannelService() {}

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
        channelMembersRepository.delete(new ChannelMemberEntity());
        return new Response();
    }
}
