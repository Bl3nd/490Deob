import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

final class pf extends lg {
	
	private AudioFormat L;
	private byte[] M;
	private int N;
	private boolean O = false;
	private SourceDataLine P;
	
	final void c() {
		try {
			if (this.P != null) {
				this.P.close();
				this.P = null;
			}
			
		} catch (RuntimeException var2) {
			throw var2;
		}
	}
	
	final void c(int var1) throws LineUnavailableException {
		try {
			try {
				Info var2 = new Info(SourceDataLine.class, this.L, var1 << (!be.forceSend ? 1 : 2));
				this.P = (SourceDataLine) AudioSystem.getLine(var2);
				this.P.open();
				this.P.start();
				this.N = var1;
			} catch (LineUnavailableException var3) {
				if (1 == ca.a(false, var1)) {
					this.P = null;
					throw var3;
				} else {
					this.c(qh.a(var1, 25920));
				}
			}
		} catch (RuntimeException var4) {
			throw var4;
		}
	}
	
	final void d() throws LineUnavailableException {
		try {
			this.P.flush();
			if (this.O) {
				this.P.close();
				this.P = null;
				Info var1 = new Info(SourceDataLine.class, this.L, this.N << (!be.forceSend ? 1 : 2));
				this.P = (SourceDataLine) AudioSystem.getLine(var1);
				this.P.open();
				this.P.start();
			}
			
		} catch (RuntimeException var2) {
			throw var2;
		}
	}
	
	final int a() {
		try {
			return this.N - (this.P.available() >> (!be.forceSend ? 1 : 2));
		} catch (RuntimeException var2) {
			throw var2;
		}
	}
	
	final void b() {
		int var1 = 256;
		if (be.forceSend) {
			var1 <<= 1;
		}
		
		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = this.q[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}
			
			this.M[var2 * 2] = (byte) (var3 >> 8);
			this.M[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		
		this.P.write(this.M, 0, var1 << 1);
	}
	
	final void a(Component component) {
		javax.sound.sampled.Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
		if (mixerInfo != null) {
			int var4 = 0;
			for (; ~mixerInfo.length < ~var4; ++var4) {
				javax.sound.sampled.Mixer.Info info = mixerInfo[var4];
				if (null != info) {
					String infoName = info.getName();
					if (infoName != null && infoName.toLowerCase().contains("soundmax")) {
						this.O = true;
					}
				}
			}
		}
		
		this.L = new AudioFormat((float) ki.sampleRate, 16, be.forceSend ? 2 : 1, true, false);
		this.M = new byte[256 << (be.forceSend ? 2 : 1)];
	}
}
