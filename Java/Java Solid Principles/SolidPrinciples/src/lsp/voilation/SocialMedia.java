package lsp.voilation;
// Liskov Substitution Principle: States that derive class must be completely
// substitutable for their base class
//if class A is a subtype of class B, then we should be able to replace B with A without interrupting
public abstract class SocialMedia {
// supported by multiple client
    //@support WhatsApp,Facebook,Instagram
    public abstract  void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract  void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract  void groupVideoCall(String... users);
}
