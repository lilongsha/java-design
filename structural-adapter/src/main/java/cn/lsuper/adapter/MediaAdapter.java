package cn.lsuper.adapter;

/**
 * @author ALGiii
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (AudioType.VLC.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (AudioType.MP4.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (AudioType.VLC.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (AudioType.MP4.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
