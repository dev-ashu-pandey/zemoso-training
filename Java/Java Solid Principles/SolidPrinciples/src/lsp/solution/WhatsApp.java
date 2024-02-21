package lsp.solution;

public class WhatsApp implements SocialMedia,SocialVideoCallManager {
    public void chatWithFriend() {
        System.out.println("Send messgae to friend");

    }

    public void sendPhotosAndVideos() {
        System.out.println("Send photos and videos");
    }

    public void groupVideoCall(String... users) {
        System.out.println("Group call with friends");
    }
}
