package boot_json_11.service;

import org.springframework.stereotype.Service;

@Service
public class HttpClientGoal {

	private static final String m11_play_cookie = "1";
	private static final String  next_visit_cookie = "1";
			
	
	private String phpSessionId;
		
			
}



//curl 'https://mistrzowska11.play.pl/events/add' -H 'Cookie: next_visit=1; _ga=GA1.2.1020349020.1529760307; _gid=GA1.2.1420754752.1529760307; AMCVS_0FCB376553B152650A490D4D%40AdobeOrg=1; et_uk=2092e7c196de4d7d841ecf67b99c1439; m11-play-cookie=1; PHPSESSID=1ba44da60blt0qnstf6f7ddcj6; AMCV_0FCB376553B152650A490D4D%40AdobeOrg=1406116232%7CMCIDTS%7C17706%7CMCMID%7C88409256367303948702720244706964319459%7CMCAAMLH-1530380792%7C9%7CMCAAMB-1530380792%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1529783192s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-17713%7CvVersion%7C2.5.0; _gat=1; _gat_UA-5141887-21=1' -H 'Origin: https://mistrzowska11.play.pl' -H 'Accept-Encoding: gzip, deflate, br' -H 'Accept-Language: pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7' -H 'User-Agent: Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.170 Mobile Safari/537.36' -H 'Content-Type: application/x-www-form-urlencoded; charset=UTF-8' -H 'Accept: */*' -H 'Referer: https://mistrzowska11.play.pl/zagraj' -H 'X-Requested-With: XMLHttpRequest' -H 'Connection: keep-alive' --data 'data=%7B%22goal_id%22%3A%225201%3B2094%22%2C%22lat%22%3A52.0197%2C%22lon%22%3A20.919499999999953%2C%22value%22%3A1%7D' --compressed

