	import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
	//import java.text.SimpleDateFormat;
import java.util.Locale;

	class Notepad {
		ArrayList<Record> notepad;
		
				
		public static class Record {
			String note;
			Date currentDate;
			
			public String getNote (){
				return note;
			}
			public void setNote (String note){
				this.note = note;
			}
			public Record () {}
			public Record (Date currentDate, String note) {}
			
			public static Record createRecord (Date date, String note){
				Record r = new Record();
				r.setNote(note);
				r.currentDate = date;
				return r;
			}
			
			public String toString() {
				return this.currentDate+ " " + this.note;
			}
		}
		
		
		public Notepad () {}
		
		public static Notepad getNewNotepad (){
			Notepad n = new Notepad();
			n.notepad = new ArrayList<Record>();
			return n;
		}
		
		public void addRecord (Record r){
			this.notepad.add(r);
		}
		
		public void printNotepad (){
			for (Record r : this.notepad) {
				System.out.println(r);
			}
		}
		
		public static boolean isSameDay(Date d1, Date d2){
			boolean res = false;
			Calendar cal1 = Calendar.getInstance();
			Calendar cal2 = Calendar.getInstance();
			cal1.setTime(d1);
			cal2.setTime(d2);
			res = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
			      cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);

			return res;
		}
		
		public static ArrayList<Record> findRecordDate(Notepad n, Date d){
			ArrayList<Record> res = new ArrayList<Record>();
			
			for (Record r : n.notepad){
				if (isSameDay(d, r.currentDate)){
					res.add(r);
				}
			}
			return res;
		}
		
		public static Notepad randomNotepad(int lines){
			Notepad newNotepad = Notepad.getNewNotepad();
			for (int i=0; i<lines; i++) {
				Calendar c = Calendar.getInstance();
				Date d = new Date();
				c.setTime(d); 
				c.add(Calendar.DATE, i);
				d = c.getTime();
				Record r = Record.createRecord(d, i + " String str ing Str I NG");;
				newNotepad.addRecord(r);
			}
			return newNotepad;
		}
		
		public static void main (String [] args) {
			Notepad book = Notepad.getNewNotepad();
			book = Notepad.randomNotepad(15);
			book.printNotepad();
			
			String string = "December 30, 2016";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
			LocalDate tcheck = LocalDate.parse(string, formatter);
			Instant instant = tcheck.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
			Date check = Date.from(instant);
			
			ArrayList<Record> match = new ArrayList<Record>();
			
			match = Notepad.findRecordDate(book, check);
			
			System.out.println("\n\n");
			for (Record r : match){
				System.out.println(r);
			}
		}
	}

