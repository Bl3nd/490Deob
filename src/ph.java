import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class ph implements Runnable {
	
	private t a;
	static int b;
	private byte[] c;
	static ob d = rf.a(40, "Startseite auf (WSpielkonto wiederherstellen(W)3");
	static ob e = rf.a(40, " <col=00ff80>");
	static fa f;
	static int g;
	private InputStream h;
	static short[] i = new short[500];
	private Socket j;
	static int k = 0;
	static int l;
	private boolean m = false;
	static int n;
	private OutputStream o;
	static int p = 0;
	static int q;
	static int r;
	static int s;
	private int t = 0;
	static ob u = rf.a(40, "(U0a )2 non)2existant gosub script)2num: ");
	private fd v;
	static int w;
	static int x;
	private int y = 0;
	private boolean z = false;
	
	public static void a(int var0) {
		try {
			e = null;
			int var1 = 122 % ((var0 - -9) / 63);
			u = null;
			d = null;
			f = null;
			i = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ph.G(" + var0 + ')');
		}
	}
	
	final void b(int var1) {
		int var3 = client.anInt_wb;
		
		try {
			++b;
			if (!this.z) {
				synchronized (this) {
					if (var1 != -2) {
						this.run();
					}
					
					this.z = true;
					this.notifyAll();
				}
				
				if (this.v != null) {
					if (var3 != 0) {}
					
					while (this.v.d == 0) {
						jd.a(1L, (byte) -8);
					}
					
					if (~this.v.d == -2) {
						try {
							((Thread) this.v.e).join();
						} catch (InterruptedException var7) {
							var7.printStackTrace();
						}
					}
				}
				
				this.v = null;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ph.D(" + var1 + ')');
		}
	}
	
	protected final void finalize() {
		try {
			this.b(-2);
			++g;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ph.finalize(" + ')');
		}
	}
	
	final int read(int var1) throws IOException {
		try {
			++n;
			if (this.z) {
				return 0;
			} else {
				return this.h.read();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ph.F(" + var1 + ')');
		}
	}
	
	static int a(int var0, int var1) {
		try {
			return var0 ^ var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ph.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	static boolean a(ob var0, byte var1) {
		try {
			++r;
			if (var0 == null) {
				return false;
			} else if (var1 != -115) {
				return true;
			} else {
				int var2 = 0;
				while (~var2 > ~ii.o) {
					if (var0.b((byte) -66, si.V[var2])) {
						return true;
					}
					
					++var2;
				}
				
				if (var0.b((byte) -111, le.T.Ic)) {
					return true;
				} else {
					return false;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ph.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	final void a(int unused, byte[] var2, int var3, int var4) throws IOException {
		int var8 = client.anInt_wb;
		
		try {
			++q;
			if (!this.z) {
				if (this.m) {
					this.m = false;
					throw new IOException();
				} else {
					if (this.c == null) {
						this.c = new byte[5000];
					}
					
					synchronized (this) {
						int var7 = 0;
						if (/*var8 != 0 || */var3 > var7) {
							do {
								this.c[this.y] = var2[var7 + var4];
								this.y = (this.y + 1) % 5000;
								if (~((this.t - -4900) % 5000) == ~this.y) {
									throw new IOException();
								}
								
								++var7;
							} while (var3 > var7);
						}
						if (this.v == null) {
							this.v = this.a.a(3360, 3, this);
						}
						
						this.notifyAll();
					}
				}
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ph.H(" + unused + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final void read(int len, byte var2, byte[] data, int off) throws IOException {
		try {
			++l;
			if (!this.z) {
				while (~len < -1) {
					int read = this.h.read(data, off, len);
					if (~read >= -1) {
						throw new EOFException();
					}
					
					len -= read;
					off += read;
				}
				
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ph.E(" + len + ',' + var2 + ',' + (data != null ? "{...}" : "null") + ',' + off + ')');
		}
	}
	
	static oh a(boolean unused, int id) {
		try {
			++s;
			oh class_oh = (oh) ch.S.a((long) id, (byte) -83);
			if (class_oh != null) {
				return class_oh;
			} else {
				byte[] data = jg.cacheFile_12.a((byte) -105, 0, id);
				if (data == null) {
					return null;
				} else {
					class_oh = new oh();
					og class_og = new og(data);
					class_og.pointer = class_og.buffer.length - 2;
					int i = class_og.readShort(79);
					int pointer = -12 + (class_og.buffer.length - 2) - i;
					class_og.pointer = pointer;
					int i1 = class_og.readInt(1029109968);
					class_oh.J = class_og.readShort(70);
					class_oh.D = class_og.readShort(59);
					class_oh.O = class_og.readShort(81);
					class_oh.P = class_og.readShort(125);
					int i2 = class_og.readUnsignedByte(255);
					int i3;
					int i4;
					if (~i2 < -1) {
						class_oh.H = new md[i2];
						i3 = 0;
						if (~i2 < ~i3) {
							do {
								i4 = class_og.readShort(56);
								md class_md = new md(qh.a(i4, 25920));
								class_oh.H[i3] = class_md;
								if (i4-- > 0) {
									do {
										int i5 = class_og.readInt(1029109968);
										int i6 = class_og.readInt(1029109968);
										class_md.a(new la(i6), (long) i5, true);
									} while (i4-- > 0);
								}
								
								++i3;
							} while (~i2 < ~i3);
						}
					}
					
					class_og.pointer = 0;
					i3 = 0;
					class_oh.E = class_og.i(114);
					class_oh.G = new int[i1];
					class_oh.L = new int[i1];
					class_oh.K = new ob[i1];
					if (~class_og.pointer <= ~pointer) {
						ch.S.a(class_oh, (byte) -120, (long) id);
						return class_oh;
					} else {
						do {
							i4 = class_og.readShort(111);
							if (~i4 != -4) {
								if (i4 < 100 && ~i4 != -22 && i4 != 38 && i4 != 39) {
									class_oh.G[i3] = class_og.readInt(1029109968);
									class_oh.L[i3++] = i4;
								} else {
									class_oh.G[i3] = class_og.readUnsignedByte(255);
									class_oh.L[i3++] = i4;
								}
							} else {
								class_oh.K[i3] = class_og.t(-19405);
								class_oh.L[i3++] = i4;
							}
						} while (~class_og.pointer > ~pointer);
						
						ch.S.a(class_oh, (byte) -120, (long) id);
						return class_oh;
					}
				}
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "ph.B(" + unused + ',' + id + ')');
		}
	}
	
	public final void run() {
		System.err.println("Method run() [Class ph]");
		int var5 = client.anInt_wb;
		
		try {
			try {
				while (true) {
					int len;
					int off;
					synchronized (this) {
						if (~this.y == ~this.t) {
							if (this.z) {
								break;
							}
							
							try {
								this.wait();
							} catch (InterruptedException var16) {
								var16.printStackTrace();
							}
						}
						
						label147:
						{
							if (~this.t >= ~this.y) {
								len = this.y + -this.t;
							} else {
								len = 5000 - this.t;
							}
						}
						
						off = this.t;
						
					}
					
					if (len > 0) {
						try {
							this.o.write(this.c, off, len);
						} catch (IOException var15) {
							this.m = true;
						}
						
						this.t = (this.t + len) % 5000;
						
						try {
							if (this.t == this.y) {
								this.o.flush();
							}
						} catch (IOException var14) {
							this.m = true;
						}
					}
				}
				
				try {
					if (this.h != null) {
						this.h.close();
					}
					
					if (this.o != null) {
						this.o.close();
					}
					
					if (this.j != null) {
						this.j.close();
					}
				} catch (IOException var13) {
					var13.printStackTrace();
				}
				
				this.c = null;
			} catch (Exception var18) {
				ra.a(null, var18, (byte) 124);
			}
			
			++w;
		} catch (RuntimeException var19) {
			throw bc.a(var19, "ph.run(" + ')');
		}
	}
	
	final int available(int var1) throws IOException {
		try {
			++x;
			if (this.z) {
				return 0;
			} else {
				return this.h.available();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ph.I(" + var1 + ')');
		}
	}
	
	ph(Socket socket, t var2) throws IOException {
		try {
			this.a = var2;
			this.j = socket;
			this.j.setSoTimeout(30000);
			this.j.setTcpNoDelay(true);
			this.h = this.j.getInputStream();
			this.o = this.j.getOutputStream();
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ph.<init>(" + (socket != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
}
