package cn.lsuper.adapter;

/**
 * @author ALGiii
 */
public interface MediaPlayer {
    /**
     * 根据媒体类型播放媒体文件
     * @param audioType 媒体类型
     * @param fileName 媒体文件名
     */
    void play(String audioType, String fileName);
}
