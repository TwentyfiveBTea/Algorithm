import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int G = sc.nextInt();
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] v = new int[n + 1];
        int[] g = new int[n + 1];
        long[][] f = new long[V + 1][G + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            v[i] = sc.nextInt();
            g[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = V; j >= v[i]; j--) {
                for (int k = G; k >= g[i]; k--) {
                    f[j][k] = Math.max(f[j][k], f[j - v[i]][k - g[i]] + t[i]);
                }
            }
        }
        System.out.println(f[V][G]);








        /*
        我知道你的生理期是月末月初，我一直都记着。这几天没有找你是我的问题，是我没有去找你，去开导情绪，我会觉得都这样了我去找你你也不太会理我，然后就会放着所谓的过几天想明白想清楚了就会好的，之前我对所有事情都是这么做的，都是自己把自己默默的调整好了就没什么事了，对于你我每次也都是这么主观的想，但是你也不一样，有情绪的是你，而不是我，我不能放着你不管，让你一个人呆着，放着你一个人只会让事情变得严重，所以每一次我都会有问题存在。安慰你我就只会那几句，我想你听到也已经烦了，“为什么他不会安慰人啊”，所谓的小红书跟抖音也不会明明白白写着女朋友使用说明书。我只能跟你讲不要烦，怎么了，跟我讲，只能在一次次吵架生气中才能知道这件事情该怎么做，下一次不这么做或者遇到问题之后我该怎么办。你可能会想着，别人的前几个月是甜蜜期，为什么到我这里就是天天吵架。那一天晚上，从来没有谈过恋爱的人在宿舍楼下支支吾吾半天 我喜欢你 这四个字始终没有说出来，在大理两个人牵个手 手都会出汗，这也奠定了我们的进度不会走的太快，我也不知道什么时候该对你做什么，只是在找一个恰当的时机，找到一个不会太突兀的时机，显得拥抱不会太突然。两个从来没有依靠对方的人，在最近找到了依靠，但是不得不承认，这个依靠好像并不靠谱。每次在路边看到成双结对的时候，我都会思考，感觉就是为什么我不去找你，我都会对自己有个很奇怪的感觉，我也说不清楚，是觉得自己没尽到责任吧，并没有过多的交流。周末也打了一通电话回去，也聊了很久，说是脸皮别那么薄。让你一直内耗的的都是我，但是我总是不做出来口中的我喜欢你，从最开始我也在慢慢改变，尽管现在还是会惹你生气，还是不能及时处理小情绪。之前你问我有没有想过以后该怎么办，在那之后我确实把我们加到了未来规划中，尽管现在出了问题，或是还有很多问题等着去解决。你很拧巴，也很在意细节，会因为一件小事情内耗，希望我能及时察觉到你的情绪，但还是我希望你能再给我多一点点点点耐心。也不知道你看完这么长一段会怎么想的，也不知道不会直接跳过中间直接来到这，不管怎么样，我还是想跟你在一起，我想在某一天心情不好的时候给你一个拥抱...
        */
    }
}
