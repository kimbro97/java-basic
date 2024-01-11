package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();
        off(musicPlayerData);
        volumeUp(musicPlayerData);
        volumeUp(musicPlayerData);
        volumeDown(musicPlayerData);
        showStatus(musicPlayerData);

        musicPlayerData.isOn = false;
        System.out.println("음악플레이어 종료합니다");
    }

    private static void showStatus(MusicPlayerData musicPlayerData) {
        System.out.println("음악 플레이어 상태확인");
        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 불륨: " + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    private static void volumeDown(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume--;
        System.out.println(musicPlayerData.volume);
    }

    private static void volumeUp(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume++;
        System.out.println(musicPlayerData.volume);
    }

    private static void off(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

}
