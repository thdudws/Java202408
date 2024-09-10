package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
	private long id;
	private long movieid;
	private String movieTitle;
	private	String SeatName;

	/*file 리소스 객체
	 * 사용을 위해서는 열어야(open) 하며 사용이 끝나면 닫아(close)야 한다.
	 * finally는 예외 발생 여부와 상관없이 안전하게 close 가능
	 */
	public static final File file = new File("src/movie/reservation.txt");
	
	public String getSeatName() {
		return SeatName;
	}

	public long getId() {
		return id;
	}

	public Reservation(long id, long movieid, String movieTitle, String SeatName) {
		this.id = id;
		this.movieid = movieid;
		this.movieTitle = movieTitle;
		this.SeatName = SeatName;
	}
	
	public Reservation(long movieid, String movieTitle, String SeatName) {
		this(Instant.now().toEpochMilli(), movieid, movieTitle, SeatName);
	}

	@Override
	public String toString() {
//		return "영화 : " + movieTitle + "좌석번호 : " + SeatName;	//다른 방식
		return String.format("영화 : %s, 좌석번호 : %s", movieTitle, SeatName);
	}

	//예약한 번호 찾기
	public static Reservation findById(String reservationId) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(reservationId.equals(temp[0])) {
					reservation = new Reservation(	//Reservation 객체 생성(생성자)
						Long.parseLong(temp[0]),	//발급번호 .형변환
						Long.parseLong(temp[1]),	//영화 ID .형변환
						temp[2],					//영화 제목
						temp[3]						//좌석명
					);
					
					break;							//파일에서 ReservationID 해당하는 id 찾았으면 종료
				}
			}
			br.close();
			return reservation;		//reservation = new Reservation
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reservation;
	}

	//예약 취소
	public static Reservation delete(String reservationId) {
		Reservation reservation = null;
		BufferedReader bf = null;
		StringBuilder text = new StringBuilder();	//문자열 변경 작업
		String line = null;
		
		try {
			
			bf = new BufferedReader(new FileReader(file));	//reservation.txt 읽어서 buffer(임시기억공간) 저장
			
			while ((line = bf.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(reservationId.equals(temp[0])) {
					reservation = new Reservation(Long.parseLong(temp[0]), Long.parseLong(temp[1]), temp[2], temp[3]);
					
					continue;
				}
				text.append(line + "\n");	//text += line + "\n"; --> 이것 대체
			}
			
			bf.close();
			
			FileWriter fw = new FileWriter(file);
			fw.write(text.toString());
			fw.close();
			return reservation;
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return reservation;
	}

	//movieId(영화 ID) 해당하는 예약 현황을 보여줌
	public static ArrayList<Reservation> findMovieId(String movieId) {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		
		BufferedReader bf = null;
		String line = null;
		
		try {
			bf = new BufferedReader(new FileReader(file));
			while ((line = bf.readLine()) != null) {
				
				String[] temp = line.split(",");
				if(movieId.equals(temp[1])) {	//영화 ID
					
					/*
					long id = Long.parseLong(temp[0]);	//예매 ID
					long mId =  Long.parseLong(temp[1]);	//영화 ID
					String movieTitle = temp[2];
					String seatName = temp[3];
					
					Reservation r = new Reservation(id, mId, movieTitle, seatName);
					reservations.add(r);
					*/ //↓ 축약 
					
					reservations.add(new Reservation(
							Long.parseLong(temp[0]), 
							Long.parseLong(temp[1]), 
							temp[2], 
							temp[3]
						));
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		return reservations;
	}

	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);
		fw.write(this.toFileString() + "\n");
		fw.close();
	}

	private String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieid, movieTitle, SeatName);
	}


}


