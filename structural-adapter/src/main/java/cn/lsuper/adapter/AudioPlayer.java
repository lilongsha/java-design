package cn.lsuper.adapter;

/**
 * @author ALGiii
 */
public class AudioPlayer implements MediaPlayer{
    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (AudioType.MP3.equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        } else if (AudioType.VLC.equalsIgnoreCase(audioType) || AudioType.MP4.equalsIgnoreCase(audioType)) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
