package oracle.certified.java.associate.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileIO {
	private static final String filePath = "filePath";
	private static final String content = "But soft! what code in yonder program breaks?\nBut soft! what code in yonder program breaks?\nBut soft! what code in yonder program breaks?\n";
	private static final String lineSeparator = System
			.getProperty("line.separator");

	private static final StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		io1();
		io2();
		io3();
	}

	private static void io2() {

		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(filePath)));
			out.write(content);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

		sb.setLength(0);

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(
					filePath)));
			String l;
			while ((l = in.readLine()) != null) {
				sb.append(l);
				sb.append(lineSeparator);
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

		System.out.print(sb.toString());
	}

	private static void io1() {
		Writer out = null;
		try {
			out = new BufferedWriter(new FileWriter(filePath));
			out.write(content);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

		sb.setLength(0);

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filePath));

			String l;
			while ((l = in.readLine()) != null) {
				sb.append(l);
				sb.append(lineSeparator);
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

		System.out.print(sb.toString());
	}

	private static void io3() {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream(filePath));
			out.write(content.getBytes());
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

		sb.setLength(0);

		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream(filePath));

			byte[] b = new byte[32];

			int s;

			while ((s = in.read(b)) != -1) {
				sb.append(new String(b, 0, s));
			}

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

		System.out.print(sb.toString());
	}
}