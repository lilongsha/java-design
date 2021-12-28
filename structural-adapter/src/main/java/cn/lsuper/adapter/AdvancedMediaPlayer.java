package cn.lsuper.adapter;

public interface AdvancedMediaPlayer {
    /**
     * 播放vlc媒体文件
     * @param fileName 媒体文件名
     */
    void playVlc(String fileName);

    /**
     * 播放mp4媒体文件
     * @param fileName 媒体文件名
     */
    void playMp4(String fileName);
}
