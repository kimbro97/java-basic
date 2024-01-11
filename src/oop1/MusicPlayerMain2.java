package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        musicPlayerData.volume++;
        System.out.println(musicPlayerData.volume);
        musicPlayerData.volume++;
        System.out.println(musicPlayerData.volume);
        musicPlayerData.volume--;
        System.out.println(musicPlayerData.volume);
        System.out.println("음악 플레이어 상태확인");
        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 불륨: " + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        musicPlayerData.isOn = false;
        System.out.println("음악플레이어 종료합니다");
    }
}
