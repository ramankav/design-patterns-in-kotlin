class MediaAdapter(audioType: String) : MediaPlayer {
    var advancedMusicPlayer: AdvancedMediaPlayer? = null
    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer!!.playVlc(fileName)
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer!!.playMp4(fileName)
        }
    }

    init {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer = Mp4Player()
        }
    }
}