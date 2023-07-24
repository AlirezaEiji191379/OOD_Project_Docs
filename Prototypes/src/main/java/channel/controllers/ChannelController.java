package channel.controllers;

import channel.context.ChannelRequest;
import channel.context.MembershipRequest;
import channel.services.contracts.ChannelMembershipService;
import channel.services.contracts.ChannelService;
import core.library.context.Response;

public class ChannelController {

    private ChannelService channelService;
    private ChannelMembershipService membershipService;

    public ChannelController() {
    }

    public Response showChannelsList() {
        return channelService.showChannelsList();
    }

    public Response createChannel(String name) {
        return channelService.createChannel(name);
    }

    public Response editChannelDetails(ChannelRequest request) {
        return channelService.editChannelDetails(request);
    }

    public Response deleteChannel(int channelId) {
        return channelService.deleteChannel(channelId);
    }

    public Response joinChannel(String joinLink) {
        return membershipService.joinChannel(joinLink);
    }

    public Response addAdminToChannel(MembershipRequest request) {
        return membershipService.addAdminToChannel(request);
    }

    public Response showMembers(int channelId) {
        return membershipService.showMembers(channelId);
    }

    public Response removeMember(MembershipRequest request) {
        return membershipService.removeMember(request);
    }

    public Response setIncomeShare(MembershipRequest request) {
        return membershipService.setIncomeShare(request);
    }

    public Response showAdmins(int channelId) {
        return membershipService.showAdmins(channelId);
    }

    public Response removeAdmins(MembershipRequest request) {
        return membershipService.removeAdmins(request);
    }
}
