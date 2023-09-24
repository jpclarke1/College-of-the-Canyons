import java.io.IOException;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class GetLiveBTC {

public static void main(String args[])
{ 
    Scanner keyboard =new Scanner (System.in);
    System.out.println("What is your account name?");
    String account=keyboard.next();
    String accountall =("https://steemit.com/@" +account+ "/transfers");
    Document doc = Jsoup.connect(accountall).get();
    Elements initialtable = doc.select("div.column.small-12.medium-4");
    initialtable.remove(0);
    String full = " ";
    int i = 1;
    System.out.println(" ");
    
    //coinmarketcap 
    String coincapsbd = ("https://coinmarketcap.com/currencies/steem-dollars/");
    Document docsbd =  Jsoup.connect(coincapsbd).get();
    Elements item = docsbd.select("div.col-xs-6.col-sm-8.col-md-4.text-left");
    Double coincapfinalsbd = 0.0;
    Double coincapfinalbtc = 0.0;
    String dr = " ";
    
    String urlcoincapeth13 = "https://api.coinmarketcap.com/v1/ticker/bitcoin/";
    Document docblocktradescoincapeth13 = Jsoup.parse(new URL(urlcoincapeth13).openStream(), "UTF-8", "", Parser.xmlParser());
    String a13 = docblocktradescoincapeth13.toString();
    int a23 = a13.indexOf("price_usd") + 13; 
    int a33 = a13.indexOf("price_btc") - 4;
    String a43 = a13.substring(a23,a33);
    Double a53 = Double.parseDouble(a43);
    //coincapmarketcap sbd - try
    String coincaptry = "https://api.coinmarketcap.com/v1/ticker/steem-dollars/?convert=TRY";
    Document coincapethdoc = Jsoup.parse(new URL(coincaptry).openStream(), "UTF-8", "", Parser.xmlParser());
    String dbcoincaptry = coincapethdoc.toString();
    int begincoincaptry  = dbcoincaptry.indexOf("price_try") + 13; 
    int endcoincaptry= dbcoincaptry.indexOf("24h_volume_try") - 4;
    dbcoincaptry = dbcoincaptry.substring(begincoincaptry,endcoincaptry);
    Double coincapetrydouble = Double.parseDouble(dbcoincaptry);
    
    String dbcoincaptry2 = coincapethdoc.toString();
    int beginsbdusd  = dbcoincaptry2.indexOf("price_usd") + 13; 
    int endsbdusd= dbcoincaptry2.indexOf("price_btc") - 4;
    String dbcoincaptry3 = dbcoincaptry2.substring(beginsbdusd,endsbdusd);
    Double coincapetrydouble2 = Double.parseDouble(dbcoincaptry3);
    
    //coinmarketcap ltc - try
    String urlcoincapeth = "https://api.coinmarketcap.com/v1/ticker/steem-dollars/?convert=LTC";
    Document docblocktradescoincapeth = Jsoup.parse(new URL(urlcoincapeth).openStream(), "UTF-8", "", Parser.xmlParser());
    String dblocktradecoincapseth = docblocktradescoincapeth.toString();
    int begincoincapeth  = dblocktradecoincapseth.indexOf("price_ltc") + 13; 
    int endcoincapeth= dblocktradecoincapseth.indexOf("24h_volume_ltc") - 4;
    dblocktradecoincapseth = dblocktradecoincapseth.substring(begincoincapeth,endcoincapeth);
    Double blocktradescoincapltc = Double.parseDouble(dblocktradecoincapseth);
    
    String urlcoincapeth1 = "https://api.coinmarketcap.com/v1/ticker/litecoin/";
    Document docblocktradescoincapeth1 = Jsoup.parse(new URL(urlcoincapeth1).openStream(), "UTF-8", "", Parser.xmlParser());
    String a1 = docblocktradescoincapeth1.toString();
    int a2 = a1.indexOf("price_usd") + 13; 
    int a3 = a1.indexOf("price_btc") - 4;
    String a4 = a1.substring(a2,a3);
    Double a5 = Double.parseDouble(a4);
    
    //coinmarketcap eth - try
    String coincapeth = "https://api.coinmarketcap.com/v1/ticker/steem-dollars/?convert=ETH";
    Document coincapethdoc2 = Jsoup.parse(new URL(coincapeth).openStream(), "UTF-8", "", Parser.xmlParser());
    String dbcoincapeth = coincapethdoc2.toString();
    int begincoincapeth2  = dbcoincapeth.indexOf("price_eth") + 13; 
    int endcoincapeth2= dbcoincapeth.indexOf("24h_volume_eth") - 4;
    dbcoincapeth = dbcoincapeth.substring(begincoincapeth2,endcoincapeth2);
    Double coincapethdouble = Double.parseDouble(dbcoincapeth);
    
    String urlcoincapeth12 = "https://api.coinmarketcap.com/v1/ticker/ethereum/";
    Document docblocktradescoincapeth12 = Jsoup.parse(new URL(urlcoincapeth12).openStream(), "UTF-8", "", Parser.xmlParser());
    String a12 = docblocktradescoincapeth12.toString();
    int a22 = a12.indexOf("price_usd") + 13; 
    int a32 = a12.indexOf("price_btc") - 4;
    String a42 = a12.substring(a22,a32);
    Double a52 = Double.parseDouble(a42);
    
    //blocktrades-bitcoin
    String urlbtc = "https://blocktrades.us/api/v2/estimate-output-amount?inputAmount=1&inputCoinType=sbd&outputCoinType=btc";
    Document docblocktrades = Jsoup.parse(new URL(urlbtc).openStream(), "UTF-8", "", Parser.xmlParser());
    String dblocktrades = docblocktrades.toString();
    dblocktrades = dblocktrades.replaceAll("\\(.*\\)", "");
    int begin  = dblocktrades.indexOf("outputAmount") + 15; 
    int end = dblocktrades.indexOf("outputCoinType") - 3;
    String dblocktrades1 = dblocktrades.substring(begin,end);
    Double blocktradesbtc = Double.parseDouble(dblocktrades1);
    
    //blocktrades-litecoin
    String urlltc = "https://blocktrades.us/api/v2/estimate-output-amount?inputAmount=1&inputCoinType=sbd%20&outputCoinType=ltc";
    Document docblocktradesltc = Jsoup.parse(new URL(urlltc).openStream(), "UTF-8", "", Parser.xmlParser());
    String dblocktradesltc = docblocktradesltc.toString();
    int beginltc  = dblocktradesltc.indexOf("outputAmount") + 15; 
    int endltc= dblocktradesltc.indexOf("outputCoinType") - 3;
    String dblocktrades1ltc = dblocktradesltc.substring(beginltc,endltc);
    Double blocktradesltc = Double.parseDouble(dblocktrades1ltc);
    
    //blocktrades-etherium
    String urleth = "https://blocktrades.us/api/v2/estimate-output-amount?inputAmount=1&inputCoinType=sbd%20&outputCoinType=eth";
    Document docblocktradeseth = Jsoup.parse(new URL(urleth).openStream(), "UTF-8", "", Parser.xmlParser());
    String dblocktradeseth = docblocktradeseth.toString();
    int begineth  = dblocktradeseth.indexOf("outputAmount") + 15; 
    int endeth= dblocktradeseth.indexOf("outputCoinType") - 3;
    dblocktradeseth = dblocktradeseth.substring(begineth,endeth);
    Double blocktradeseth = Double.parseDouble(dblocktradeseth);
    
    //koinim.com - btc
    
    String k = "https://koinim.com/ticker/";
    Document k1 = Jsoup.parse(new URL(k).openStream(), "UTF-8", "", Parser.xmlParser());
    String k2 = k1.toString();
    int k3  = k2.indexOf("sell") + 7; 
    int k4= k2.indexOf("high") - 4;
    String k5 = k2.substring(k3,k4);
    Double k6 = Double.parseDouble(k5);
    //System.out.println(k6);
    
    //koinim.com - ltc
    
    String k9 = "https://koinim.com/ticker/ltc/";
    Document k19 = Jsoup.parse(new URL(k9).openStream(), "UTF-8", "", Parser.xmlParser());
    String k29 = k19.toString();
    int k39  = k29.indexOf("sell") + 7; 
    int k49= k29.indexOf("high") - 4;
    String k59 = k29.substring(k39,k49);
    Double k69 = Double.parseDouble(k59);
    //System.out.println(k69);
        
        for (Element d : item) {
            dr = d.text();
            int parant = dr.indexOf(")") + 2;
            int btccoincap = dr.indexOf("B") - 1;
            String coincapbtc = dr.substring(parant,btccoincap);
            coincapfinalbtc = Double.parseDouble(coincapbtc);
            int space = dr.indexOf(' ');
            String coincapdolar = dr.substring(0,space);
            coincapfinalsbd = Double.parseDouble(coincapdolar);
        }
        for (Element row : initialtable ) 
            {
            full = row.text();
            //System.out.println(full);
            int m = full.indexOf('S');
            int d = full.indexOf('$');
          
            if (m + 6 == d  && d > 1)
            {
            //System.out.println("Saving: " + full);
            }
            else if ( m > 0)
            {
            System.out.println("Your steem power: " +full);
      
            }
            else if (d >= 0 && i < 2)
            {
                i = 3;
                System.out.println("Your steem dolar: " +full+ "\n");
                int length = full.length();
                String sbd = full.substring(1,length);
                Double y = Double.parseDouble(sbd);
                double y1 = y * coincapfinalsbd;
                double y2 = y * coincapfinalbtc;
                double coincapltc = y * blocktradescoincapltc;
                double coincappeth = y * coincapethdouble;
                double trycoincap = y * coincapetrydouble;
                
                
                System.out.println("Coinmarketcap \n-----------------");
                // coincapmarket 1 btc,eth,ltc
                
                System.out.println("1 sbd in usd: " +coincapetrydouble2+ " USD.");
                System.out.println("1 btc in usd: " +a53+ " USD.");
                System.out.println("1 ltc in usd: " +a5+ " USD.");
                System.out.println("1 etc in usd: " +a52+ " USD. \n");

                
                // coincapmarket sbd 
                System.out.println("Your sbd money in usd: " +y1+ " USD.");
                System.out.println("Your sbd money in try: " +trycoincap+ " TRY. \n");
                
                System.out.println("Your sbd money in btc: " +y2+ " BTC.");
                System.out.println("Your sbd money in ltc: " +coincapltc+ " LTC.");
                System.out.println("Your sbd money in eth: " +coincappeth+ " ETH. \n");
                
                
                //blocktrades btc
                double y3 = y * blocktradesbtc;
                double y4 = ((y2-y3)*a53);
                System.out.println("Blocktrades.us \n-----------------");
                System.out.println("Your sbd money in btc: " +y3+ " BTC.");
                
                //blocktrades ltc
                double y5 = y * blocktradesltc;
                double y6 = (coincapltc- y5) * a5;
                System.out.println("Your sbd money in ltc: " +y5+ " LTC.");
                
                //blocktrades ether
                double y7 = y * blocktradeseth;
                double d8 = (coincappeth-y7) * a52;
                System.out.println("Your sbd money in eth: " +y7+ " ETH. \n");
                
                //Koinim.com
                double k7 = k6 * y3;
                double k8 = y5* k69 ; 
                System.out.println("Koinim.com \n-----------------");
                System.out.println("Your btc money in TRY: " +k7+ " TRY.");
                System.out.println("Your ltc money in TRY: " +k8+ " TRY. \n");
                
                //Overall
                System.out.println ("Comparision \n------------------");
                System.out.println("BTC Comission of Blocktrades.us: " +y4+ " USD.");
                System.out.println("LTC Comission of Blocktrades.us: " +y6+ " USD.");
                System.out.println("ETC Comission of Blocktrades.us: " +d8+ " USD.");
            }
            
            
            
            
        }    
      
    } 
}

