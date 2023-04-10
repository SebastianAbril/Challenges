public class ScoringSystem {
    public static int[] calculateScores(String str){
    int[] resultados = new int[3];
    int scoreAndy = 0;
    int scoreBen = 0;
    int scoreCharlotte = 0;

    for(int i = 0; i<str.length(); i++){

        switch(str.charAt(i)){
            case 'A':
                scoreAndy++;
                break;
            case 'B':
                scoreBen++;
                break;
            case 'C':
                scoreCharlotte++;
                break;
        }
    }
    resultados[0] = scoreAndy;
    resultados[1] = scoreBen;
    resultados[2] = scoreCharlotte;
    return resultados;
    }

    public static void main(String[] Args){
        System.out.println(calculateScores("AAABBBBCCCCC"));
    }
}
