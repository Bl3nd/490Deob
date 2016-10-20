import java.util.zip.Inflater;

final class wh {
	
	private Inflater a;
	static ob sl_button = rf.a(40, "sl_button");
	static int c;
	static int d;
	static pi pi_e = new pi();
	static int f = 0;
	static int g;
	static ob h = rf.a(40, "Begeben Sie sich in ein freies Gebiet)1 um");
	static int i = 0;
	
	static void a(boolean forceSend, int unused, int unused2, int unused3) {
		try {
			++c;
			ki.sampleRate = 22050;
			be.forceSend = forceSend;
			e.anInt_a = 2;
		} catch (RuntimeException e) {
			throw bc.a(e, "wh.A(" + forceSend + ',' + unused + ',' + unused2 + ',' + unused3 + ')');
		}
	}
	
	public wh() {
		this(-1, 1000000, 1000000);
	}
	
	final void a(byte[] var1, og var2, byte var3) {
		try {
			++g;
			if (~var2.buffer[var2.pointer] == -32 && var2.buffer[var2.pointer + 1] == -117) {
				if (this.a == null) {
					this.a = new Inflater(true);
				}
				
				try {
					if (var3 <= 88) {
						this.a = null;
					}
					
					if (this.a != null) {
						this.a.setInput(var2.buffer, var2.pointer + 10, var2.buffer.length + -8 + -var2.pointer + -10);
						this.a.inflate(var1);
					}
				} catch (Exception var5) {
					if (this.a != null) {
						this.a.reset();
					}
					throw new RuntimeException("Invalid GZIP compressed data!");
				}
				
				if (this.a != null) {
					this.a.reset();
				}
			} else {
				throw new RuntimeException("Invalid GZIP header!");
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "wh.C(" + (var1 != null ? "{...}" : "null") + ',' + "{...}" + ',' + var3 + ')');
		}
	}
	
	static fa[] a(pe cacheFile8, int unused, int value) {
		try {
			++d;
			if (!ba.a((byte) 98, cacheFile8, value)) {
				return null;
			} else {
				return cc.a(false);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "wh.B(" + (cacheFile8 != null ? "{...}" : "null") + ',' + unused + ',' + value + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			sl_button = null;
			h = null;
			if (var0 == 51) {
				pi_e = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wh.D(" + var0 + ')');
		}
	}
	
	private wh(int var1, int var2, int var3) {}
}
