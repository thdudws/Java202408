package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {

	private long id; // 영화 고유 번호
	private String title; // 영화 제목
	private String genre; // 영화 장르

	private static final File file = new File("src/movie/movies.txt");
	
	public Movie(String title, String genre) {
		this.id = Instant.now().getEpochSecond(); // 타임스탬프
		this.title = title;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}

	public void save() throws IOException { // save 던지기
		FileWriter fw = new FileWriter(file, true); // true -> append(추가)

		fw.write(this.toFileString() + "\n");
		fw.close();
	}

	private String toFileString() {
		return String.format("%d,%s,%s", id, title, genre);
	}

	public static Movie findAll(String movieId) {
		Movie movie = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(movieId.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
					break;
				}
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return movie;
	}
	
	
	public static ArrayList<Movie> findAll() throws IOException {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;

		try {

			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {
				String[] temp = line.split(",");

				Movie movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);

				movies.add(movie);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		br.close();
		return movies;

	}

	public String toString() {
		return String.format("[%d] : %s(%s)", id, title, genre);
	}

	public static void delete(String movieId) {
		BufferedReader br = null; // BufferedReader 객체 선언
		String text = ""; // 파일에서 읽어온 텍스트를 저장할 문자열
		String line = ""; // 파일에서 한 줄씩 읽어올 문자열

		try {
			// 파일을 읽기 위해 BufferedReader를 FileReader로 초기화
			br = new BufferedReader(new FileReader(file));

			// 파일의 모든 줄을 읽음 (1725612846,에이리언:로문룰스,공포)
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(","); 
				// 각 줄을 쉼표(,)로 구분하여 배열에 저장
				/* temp[0] = 1725612846
				 * temp[1] = 에이리언:로문룰스
				 * temp[2] = 공포
				 * id -> 1725612846
				 */
				if (movieId.equals(temp[0])) { // movieId가 첫 번째 요소(temp[0])와 같으면 해당 줄 삭제
					continue; 				   //continue로 다음 줄로 넘어감
				}
				text += line + "\n";		   //삭제되지 않은 줄은 text에 추가
				/*
				 *1627175707,에벤져스,판타지 + "\n" + 1627175946,컨져링,호러 + "\n" 
				 * 1708309326,소풍,드라마 + "\n" + 1708309377,데드맨,범죄 + "\n"
 				 * 1725842197,비틀쥬스 비틀쥬스,코미디 + "\n"
				 */
			}
			br.close();	//BufferedReader를 닫음

			FileWriter fw = new FileWriter(file);
			fw.write(text);		//새로운 내용으로 파일을 덮어씀
			
			fw.close();			//FileWriter를 닫음

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	


}
