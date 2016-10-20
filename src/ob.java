import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

final class ob implements uh {
	
	static int a;
	static int b;
	static int c;
	static int d;
	static int e;
	static int f;
	static int g;
	private int h;
	static int i;
	private boolean j = true;
	static int k;
	static int l;
	static int m;
	static int n;
	static int o;
	static int anInt_p;
	static int q;
	byte[] buffer;
	static pi s = new pi();
	static int t;
	static int u;
	int length;
	static int w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int E;
	static int F;
	static int G;
	static int H;
	static int I;
	static int J;
	static int K;
	static int L;
	static int M;
	static int N;
	static int O;
	static ob P = rf.a(40, "http:)4)4www)3runescape)3com");
	static int Q;
	static int R;
	static ob S = rf.a(40, "lila:");
	static volatile long T = 0L;
	static int U = -1;
	static short[][] V;
	static int W;
	static int X;
	static int[][][] Y;
	static int Z;
	static int ab;
	static boolean[] bb = new boolean[100];
	static ob cb = rf.a(40, "Die Verbindung konnte");
	static int db;
	
	final void a(Graphics var1, int var2, int var3, int var4) {
		try {
			if (var2 >= 99) {
				++C;
				
				String var5;
				try {
					var5 = new String(this.buffer, 0, this.length, "ISO-8859-1");
				} catch (UnsupportedEncodingException var6) {
					var5 = new String(this.buffer, 0, this.length);
				}
				
				var1.drawString(var5, var4, var3);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.IA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final ob a(int unused) {
		try {
			++q;
			ob class_ob = new ob();
			class_ob.length = this.length;
			class_ob.buffer = new byte[this.length];
			boolean flag = true;
			int i = 0;
			if (this.length <= i) {
				return class_ob;
			} else {
				do {
					byte var5 = this.buffer[i];
					if (~var5 == -96) {
						flag = true;
						class_ob.buffer[i] = 32;
						++i;
						continue;
					}
					
					if (var5 >= 97 && ~var5 >= -123 && flag) {
						class_ob.buffer[i] = (byte) (var5 - 32);
						flag = false;
						++i;
					} else {
						flag = false;
						class_ob.buffer[i] = var5;
						++i;
					}
				} while (this.length > i);
				
				return class_ob;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.QA(" + unused + ')');
		}
	}
	
	final boolean a(ob class_ob, boolean unused) {
		try {
			++db;
			if (class_ob.length > this.length) {
				return false;
			} else {
				int length = this.length + -class_ob.length;
				int index = 0;
				if (~index <= ~class_ob.length) {
					return true;
				} else {
					while (~index > ~class_ob.length) {
						if (this.buffer[index + length] != class_ob.buffer[index]) {
							return false;
						}
						
						++index;
					}
					
					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.GA(" + "{...}" + ',' + unused + ')');
		}
	}
	
	final int a(int unused, int pointer) {
		try {
			++R;
			return 0xff & this.buffer[pointer];
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.LA(" + unused + ',' + pointer + ')');
		}
	}
	
	private long a(byte var1) {
		try {
			long var2 = 0L;
			if (var1 != 1) {
				return 39L;
			} else {
				for (int var4 = 0; ~this.length < ~var4; ++var4) {
					var2 = (long) (255 & this.buffer[var4]) + -var2 + (var2 << 5);
				}
				
				++x;
				return var2;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ob.T(" + var1 + ')');
		}
	}
	
	final ob a(int pointer, int srcPointer, byte unused) {
		try {
			++D;
			ob ob = new ob();
			ob.buffer = new byte[pointer + -srcPointer];
			ob.length = -srcPointer + pointer;
			p.arrayCopy(this.buffer, srcPointer, ob.buffer, 0, ob.length);
			return ob;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ob.Q(" + pointer + ',' + srcPointer + ',' + unused + ')');
		}
	}
	
	Class eb;
	
	final ob b(byte var1) {
		try {
			++u;
			long var2 = this.a((byte) 1);
			synchronized (eb != null ? eb : (eb = a("ob"))) {
				ld var7;
				if (re.z == null) {
					re.z = new md(4096);
				} else {
					for (var7 = (ld) re.z.a(var2, 22346); var7 != null; var7 = (ld) re.z.b((int) -43)) {
						if (this.a((byte) 77, var7.p)) {
							return var7.p;
						}
					}
				}
				
				if (var1 >= -92) {
					this.j = true;
				}
				
				var7 = new ld();
				this.j = false;
				var7.p = this;
				re.z.a(var7, var2, true);
			}
			
			return this;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "ob.KA(" + var1 + ')');
		}
	}
	
	/*public final String toString() {
		try {
			++N;
			//throw new RuntimeException();
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ob.toString(" + ')');
		}
	}*/
	
	static d b(int var0, int var1) {
		try {
			if (var1 >= -5) {
				T = -125L;
			}
			
			++E;
			d var2 = (d) ji.p.a((long) var0, (byte) -55);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ga.cacheFile22.a((byte) 72, ii.b(-85, var0), client.b(var0, (byte) 122));
				var2 = new d();
				if (var3 != null) {
					var2.a((int) 124, (og) (new og(var3)));
				}
				
				ji.p.a(var2, (byte) -126, (long) var0);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.NA(" + var0 + ',' + var1 + ')');
		}
	}
	
	final ob a(ob class_ob, byte unused) {
		try {
			++M;
			if (!this.j) {
				throw new IllegalArgumentException();
			} else {
				this.h = 0;
				if (this.buffer.length < class_ob.length + this.length) {
					int i = 1;
					while (~i > ~(this.length + class_ob.length)) {
						i += i;
					}
					
					byte[] data = new byte[i];
					p.arrayCopy(this.buffer, 0, data, 0, this.length);
					this.buffer = data;
				}
				
				p.arrayCopy(class_ob.buffer, 0, this.buffer, this.length, class_ob.length);
				this.length += class_ob.length;
				return this;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.CA(" + (class_ob != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	public final int hashCode() {
		try {
			++f;
			return this.c((int) 3529);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ob.hashCode(" + ')');
		}
	}
	
	public final boolean equals(Object var1) {
		try {
			++a;
			if (var1 instanceof ob) {
				return this.a((byte) 116, (ob) var1);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.equals(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(Applet var1, byte var2) throws Throwable {
		try {
			String var3 = new String(this.buffer, 0, this.length);
			if (var2 == 116) {
				sd.a(621, var3, var1);
				++A;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.EA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final ob a(byte unused, int srcPointer) {
		try {
			++K;
			return this.a(this.length, srcPointer, (byte) 107);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.K(" + unused + ',' + srcPointer + ')');
		}
	}
	
	final int a(boolean unused) {
		try {
			++anInt_p;
			return this.length;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.J(" + unused + ')');
		}
	}
	
	final byte[] getBytes(int unused) {
		try {
			++c;
			byte[] dest = new byte[this.length];
			p.arrayCopy(this.buffer, 0, dest, 0, this.length);
			return dest;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.L(" + unused + ')');
		}
	}
	
	final int b(ob class_ob, byte unused) {
		try {
			++n;
			return this.a(-1, 0, class_ob);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.HA(" + (class_ob != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	final int a(int var1, int var2, int var3) {
		int var6 = client.anInt_wb;
		
		try {
			++y;
			byte var4 = (byte) var2;
			int var5 = var3;
			if (var1 >= -106) {
				V = null;
				if (var6 != 0) {
					if (~this.buffer[var3] == ~var4) {
						return var3;
					}
					
					var5 = var3 + 1;
				}
			}
			
			while (~var5 > ~this.length) {
				if (~this.buffer[var5] == ~var4) {
					return var5;
				}
				
				++var5;
			}
			
			return -1;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.E(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final ob c(int var1, int var2) {
		try {
			++l;
			if (var2 >= -88) {
				this.a((int) 98, (ob) null);
			}
			
			if (var1 > 0 && ~var1 >= -256) {
				ob var3 = new ob();
				var3.buffer = new byte[this.length + 1];
				var3.length = 1 + this.length;
				p.arrayCopy((byte[]) this.buffer, 0, (byte[]) var3.buffer, 0, this.length);
				var3.buffer[this.length] = (byte) var1;
				return var3;
			} else {
				throw new IllegalArgumentException("invalid char");
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.A(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int c(ob var1, byte var2) {
		try {
			++J;
			int var3;
			if (~var1.length <= ~this.length) {
				var3 = this.length;
			} else {
				var3 = var1.length;
			}
			
			for (int var4 = 0; var4 < var3; ++var4) {
				if (~(this.buffer[var4] & 255) > ~(255 & var1.buffer[var4])) {
					return -1;
				}
				
				if (~(var1.buffer[var4] & 255) > ~(this.buffer[var4] & 255)) {
					return 1;
				}
			}
			
			if (~this.length > ~var1.length) {
				return -1;
			} else if (~var1.length > ~this.length) {
				return 1;
			} else {
				if (var2 >= -115) {
					this.buffer = null;
				}
				
				return 0;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ob.N(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final ob c(byte unused) {
		try {
			++t;
			ob class_ob = new ob();
			class_ob.length = this.length;
			class_ob.buffer = new byte[this.length];
			int size = 0;
			if (~size <= ~this.length) {
				return class_ob;
			} else {
				do {
					byte b = this.buffer[size];
					if (~b <= -66 && ~b >= -91) {
						b = (byte) (b + 32);
						class_ob.buffer[size] = b;
						++size;
					} else {
						if (~b <= 63 && ~b >= 33 && b != -41) {
							b = (byte) (b + 32);
						}
						
						class_ob.buffer[size] = b;
						++size;
					}
				} while (~size > ~this.length);
				
				return class_ob;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.MA(" + unused + ')');
		}
	}
	
	final int d(int unused, int i) {
		int dummy = client.anInt_wb;
		
		try {
			if (~i > -2 || i > 36) {
				i = 10;
			}
			
			++W;
			boolean flag = false;
			boolean flag2 = false;
			int i1 = 0;
			int i2 = 0;
			if (/*dummy == 0 && */~this.length >= ~i2) {
				if (!flag) {
					throw new NumberFormatException();
				} else {
					return i1;
				}
			} else {
				while (true) {
					label147:
					{
						int i3 = this.buffer[i2] & 0xff;
						if (i2 == 0) {
							if (i3 == 45) {
								flag2 = true;
								if (dummy == 0) {
									++i2;
									break label147;
								}
							}
							
							if (i3 == 43 && dummy == 0) {
								++i2;
								break label147;
							}
						}
						
						if (~i3 <= -49) {
							if (i3 > 57) {
								if (~i3 <= -66) {
									if (~i3 < -91) {
										if (~i3 > -98 || i3 > 122) {
											break;
										}
										
										i3 -= 87;
										if (dummy != 0) {
											break;
										}
									} else {
										i3 -= 55;
										if (dummy != 0) {
											i3 -= 48;
										}
									}
								} else {
									if (~i3 > -98 || i3 > 122) {
										break;
									}
									
									i3 -= 87;
									if (dummy != 0) {
										break;
									}
								}
							} else {
								i3 -= 48;
							}
						} else if (~i3 <= -66) {
							if (~i3 < -91) {
								if (~i3 > -98 || i3 > 122) {
									break;
								}
								
								i3 -= 87;
								if (dummy != 0) {
									break;
								}
							} else {
								i3 -= 55;
								if (dummy != 0) {
									i3 -= 48;
								}
							}
						} else {
							if (~i3 > -98 || i3 > 122) {
								break;
							}
							
							i3 -= 87;
							if (dummy != 0) {
								break;
							}
						}
						
						if (~i >= ~i3) {
							throw new NumberFormatException();
						}
						
						if (flag2) {
							i3 = -i3;
						}
						
						int i4 = i3 + i * i1;
						if (~i1 != ~(i4 / i)) {
							throw new NumberFormatException();
						}
						
						flag = true;
						i1 = i4;
						++i2;
					}
					
					if (~this.length >= ~i2) {
						if (!flag) {
							throw new NumberFormatException();
						}
						
						return i1;
					}
				}
				
				throw new NumberFormatException();
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "ob.B(" + unused + ',' + i + ')');
		}
	}
	
	final int a(FontMetrics var1, int var2) {
		try {
			++w;
			
			String var3;
			try {
				var3 = new String(this.buffer, var2, this.length, "ISO-8859-1");
			} catch (UnsupportedEncodingException var4) {
				var3 = new String(this.buffer, 0, this.length);
			}
			
			return var1.stringWidth(var3);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ob.DA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final int c(int unused) {
		try {
			++I;
			int value = 0;
			for (int index = 0; index < this.length; ++index) {
				value = (value << 5) + (-value + (this.buffer[index] & 0xff));
			}
			
			return value;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.F(" + unused + ')');
		}
	}
	
	public static void d(byte var0) {
		try {
			V = null;
			Y = null;
			bb = null;
			S = null;
			int var1 = 87 / ((var0 - -30) / 35);
			P = null;
			s = null;
			cb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ob.OA(" + var0 + ')');
		}
	}
	
	private boolean a(int var1, byte var2) {
		int var9 = client.anInt_wb;
		
		try {
			if (var1 < 1 || ~var1 < -37) {
				var1 = 10;
			}
			
			boolean var3 = false;
			++z;
			boolean var4 = false;
			int var5 = 0;
			int var6 = 0;
			if (var2 != 114) {
				return true;
			} else {
				while (true) {
					if (~var6 <= ~this.length) {
						return var4;
					}
					
					label83:
					{
						int var7 = this.buffer[var6] & 255;
						if (~var6 == -1) {
							if (var7 == 45) {
								var3 = true;
								if (var9 == 0) {
									break label83;
								}
							}
							
							if (var7 == 43 && var9 == 0) {
								break label83;
							}
						}
						
						label84:
						{
							if (var7 >= 48 && var7 <= 57) {
								var7 -= 48;
								if (var9 == 0) {
									break label84;
								}
							}
							
							if (var7 >= 65 && var7 <= 90) {
								var7 -= 55;
							} else {
								if (var7 < 97 || var7 > 122) {
									break;
								}
								
								var7 -= 87;
								if (var9 != 0) {
									break;
								}
							}
						}
						
						if (~var7 <= ~var1) {
							return false;
						}
						
						if (var3) {
							var7 = -var7;
						}
						
						int var8 = var5 * var1 - -var7;
						if (~var5 != ~(var8 / var1)) {
							return false;
						}
						
						var5 = var8;
						var4 = true;
					}
					
					++var6;
				}
				
				return false;
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "ob.P(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int a(boolean var1, ob var2) {
		int var5 = client.anInt_wb;
		
		try {
			int var3;
			label69:
			{
				++H;
				if (~this.length >= ~var2.length) {
					var3 = this.length;
					if (var5 == 0) {
						break label69;
					}
				}
				
				var3 = var2.length;
			}
			
			if (var1) {
				Y = null;
			}
			
			int var4 = 0;
			if (var5 == 0 && ~var4 <= ~var3) {
				return ~var2.length < ~this.length ? -1 : (~var2.length > ~this.length ? 1 : 0);
			} else {
				do {
					if (~ja.C[this.buffer[var4] & 255] > ~ja.C[255 & var2.buffer[var4]]) {
						return -1;
					}
					
					if (~ja.C[255 & this.buffer[var4]] < ~ja.C[255 & var2.buffer[var4]]) {
						return 1;
					}
					
					++var4;
				} while (~var4 > ~var3);
				
				if (~var2.length < ~this.length) {
					return -1;
				} else if (~var2.length > ~this.length) {
					return 1;
				} else {
					return 0;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.V(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int a(int var1, byte var2, int var3, int var4, byte[] var5) {
		try {
			p.arrayCopy(this.buffer, var3, var5, var4, var1 + -var3);
			++g;
			return -var3 + var1;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.O(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean a(byte unused, ob class_ob) {
		try {
			++B;
			if (class_ob == null) {
				return false;
			} else if (~this.length != ~class_ob.length) {
				return false;
			} else {
				if (!this.j || !class_ob.j) {
					if (this.h == 0) {
						this.h = this.c(3529);
						if (~this.h == -1) {
							this.h = 1;
						}
					}
					
					if (~class_ob.h == -1) {
						class_ob.h = class_ob.c(3529);
						if (class_ob.h == 0) {
							class_ob.h = 1;
						}
					}
					
					if (~class_ob.h != ~this.h) {
						return false;
					}
				}
				
				for (int var3 = 0; ~this.length < ~var3; ++var3) {
					if (~this.buffer[var3] != ~class_ob.buffer[var3]) {
						return false;
					}
				}
				
				return true;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ob.AA(" + unused + ',' + "{...}" + ')');
		}
	}
	
	final URL e(byte var1) throws MalformedURLException {
		try {
			if (var1 != -54) {
				this.hashCode();
			}
			
			++L;
			return new URL(new String(this.buffer, 0, this.length));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.FA(" + var1 + ')');
		}
	}
	
	final ob d(int var1) {
		int var6 = client.anInt_wb;
		
		try {
			++Q;
			if (var1 != 38) {
				this.i((byte) 115);
			}
			
			int var2 = 0;
			if (var6 != 0) {
				++var2;
			}
			
			while (~this.length < ~var2 && (~this.buffer[var2] <= -1 && ~this.buffer[var2] >= -33 || ~(255 & this.buffer[var2]) == -161)) {
				++var2;
			}
			
			int var3 = this.length;
			if (var6 != 0) {
				--var3;
			}
			
			while (~var2 > ~var3 && (this.buffer[var3 - 1] >= 0 && ~this.buffer[-1 + var3] >= -33 || ~(this.buffer[-1 + var3] & 255) == -161)) {
				--var3;
			}
			
			if (var2 == 0 && this.length == var3) {
				return this;
			} else {
				ob var4 = new ob();
				var4.length = -var2 + var3;
				var4.buffer = new byte[var4.length];
				int var5 = 0;
				if (var6 == 0 && ~var5 <= ~var4.length) {
					return var4;
				} else {
					do {
						var4.buffer[var5] = this.buffer[var5 + var2];
						++var5;
					} while (~var5 > ~var4.length);
					
					return var4;
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.JA(" + var1 + ')');
		}
	}
	
	final ob f(byte var1) {
		try {
			++b;
			ob var2 = ug.a(this.e(var1 ^ 19820), 0);
			return var1 != 34 ? null : (var2 == null ? ri.m : var2);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.W(" + var1 + ')');
		}
	}
	
	final long e(int unused) {
		try {
			++Z;
			long l = 0L;
			int index = 0;
			for (; ~this.length < ~index && ~index > -13; ++index) {
				l *= 37L;
				byte b = this.buffer[index];
				if (~b <= -66 && b <= 90) {
					l += (long) (-64 + b);
				} else if (~b <= -98 && b <= 122) {
					l += (long) (-97 + (1 - -b));
				} else if (b >= 48 && ~b >= -58) {
					l += (long) (-48 + b + 27);
				}
			}
			
			while (~(l % 37L) == -1L && ~l != -1L) {
				l /= 37L;
			}
			
			return l;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.C(" + unused + ')');
		}
	}
	
	final int f(int unused) {
		try {
			++G;
			return this.d(-128, 10);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.S(" + unused + ')');
		}
	}
	
	final int a(int unused, int i, ob class_ob) {
		try {
			++O;
			int[] ints = new int[class_ob.length];
			int[] ints1 = new int[256];
			int[] ints2 = new int[class_ob.length];
			int i1 = 0;
			while (~i1 > ~ints1.length) {
				ints1[i1] = class_ob.length;
				++i1;
			}
			
			int i2 = 1;
			if (class_ob.length >= i2) {
				do {
					ints[i2 - 1] = -i2 + (class_ob.length << 1);
					ints1[bd.b(class_ob.buffer[i2 - 1], 255)] = class_ob.length + -i2;
					++i2;
				} while (class_ob.length >= i2);
			}
			
			int i3 = 1 + class_ob.length;
			int length = class_ob.length;
			int i4;
			int i5;
			int i6;
			int i7;
			int i8;
			int i9;
			if (~length >= -1) {
				i4 = i3;
				i3 = 1 + class_ob.length - i3;
				i6 = 0;
				i7 = 1;
				if (i3 < i7) {
					i5 = 1;
					if (i4 < class_ob.length) {
						do {
							i8 = i5;
							if (~i5 >= ~i4) {
								do {
									if (class_ob.length + i4 - i8 <= ints[i8 + -1]) {
										ints[-1 + i8] = -i8 + class_ob.length + i4;
									}
									
									++i8;
								} while (~i8 >= ~i4);
							}
							
							i5 = i4 + 1;
							i4 = -ints2[-1 + i3] + i4 + i3;
							i3 = ints2[-1 + i3];
						} while (i4 < class_ob.length);
					}
					
					i8 = class_ob.length + i - 1;
					if (i8 >= this.length) {
						return -1;
					}
					
					do {
						i9 = class_ob.length - 1;
						while (~i9 <= -1 && this.buffer[i8] == class_ob.buffer[i9]) {
							--i8;
							--i9;
						}
						
						if (~i9 == 0) {
							return i8 + 1;
						}
						
						i8 += Math.max(ints1[this.buffer[i8] & 255], ints[i9]);
					} while (i8 < this.length);
					
					return -1;
				}
				
				ints2[i7 - 1] = i6;
				while (true) {
					while (true) {
						if (i6 >= 1) {
							if (class_ob.buffer[-1 + i6] != class_ob.buffer[-1 + i7]) {
								i6 = ints2[i6 + -1];
								continue;
							}
							
							++i7;
							++i6;
						} else {
							++i7;
							++i6;
						}
						
						if (i3 < i7) {
							i5 = 1;
							if (i4 < class_ob.length) {
								do {
									i8 = i5;
									if (~i5 >= ~i4) {
										do {
											if (class_ob.length + i4 - i8 <= ints[i8 + -1]) {
												ints[-1 + i8] = -i8 + class_ob.length + i4;
											}
											
											++i8;
										} while (~i8 >= ~i4);
									}
									
									i5 = i4 + 1;
									i4 = -ints2[-1 + i3] + i4 + i3;
									i3 = ints2[-1 + i3];
								} while (i4 < class_ob.length);
							}
							
							i8 = class_ob.length + i - 1;
							if (i8 >= this.length) {
								return -1;
							}
							
							do {
								i9 = class_ob.length - 1;
								while (~i9 <= -1 && this.buffer[i8] == class_ob.buffer[i9]) {
									--i8;
									--i9;
								}
								
								if (~i9 == 0) {
									return i8 + 1;
								}
								
								i8 += Math.max(ints1[this.buffer[i8] & 255], ints[i9]);
							} while (i8 < this.length);
							
							return -1;
						}
						
						ints2[i7 - 1] = i6;
					}
				}
			}
			
			ints2[-1 + length] = i3;
			while (true) {
				while (true) {
					if (~class_ob.length <= ~i3) {
						if (class_ob.buffer[-1 + i3] != class_ob.buffer[length - 1]) {
							if (~ints[i3 + -1] <= ~(class_ob.length + -length)) {
								ints[i3 + -1] = class_ob.length + -length;
							}
							
							i3 = ints2[i3 - 1];
							continue;
						}
						
						--i3;
						--length;
					} else {
						--i3;
						--length;
					}
					
					if (~length >= -1) {
						i4 = i3;
						i3 = 1 + class_ob.length - i3;
						i6 = 0;
						i7 = 1;
						if (i3 < i7) {
							i5 = 1;
							if (i4 < class_ob.length) {
								do {
									i8 = i5;
									if (~i5 >= ~i4) {
										do {
											if (class_ob.length + i4 - i8 <= ints[i8 + -1]) {
												ints[-1 + i8] = -i8 + class_ob.length + i4;
											}
											
											++i8;
										} while (~i8 >= ~i4);
									}
									
									i5 = i4 + 1;
									i4 = -ints2[-1 + i3] + i4 + i3;
									i3 = ints2[-1 + i3];
								} while (i4 < class_ob.length);
							}
							
							i8 = class_ob.length + i - 1;
							if (i8 >= this.length) {
								return -1;
							}
							
							do {
								i9 = class_ob.length - 1;
								while (~i9 <= -1 && this.buffer[i8] == class_ob.buffer[i9]) {
									--i8;
									--i9;
								}
								
								if (~i9 == 0) {
									return i8 + 1;
								}
								
								i8 += Math.max(ints1[this.buffer[i8] & 255], ints[i9]);
							} while (i8 < this.length);
							
							return -1;
						}
						
						ints2[i7 - 1] = i6;
						while (true) {
							while (true) {
								if (i6 >= 1) {
									if (class_ob.buffer[-1 + i6] != class_ob.buffer[-1 + i7]) {
										i6 = ints2[i6 + -1];
										continue;
									}
									
									++i7;
									++i6;
								} else {
									++i7;
									++i6;
								}
								
								if (i3 < i7) {
									i5 = 1;
									if (i4 < class_ob.length) {
										do {
											i8 = i5;
											if (~i5 >= ~i4) {
												do {
													if (class_ob.length + i4 - i8 <= ints[i8 + -1]) {
														ints[-1 + i8] = -i8 + class_ob.length + i4;
													}
													
													++i8;
												} while (~i8 >= ~i4);
											}
											
											i5 = i4 + 1;
											i4 = -ints2[-1 + i3] + i4 + i3;
											i3 = ints2[-1 + i3];
										} while (i4 < class_ob.length);
									}
									
									i8 = class_ob.length + i - 1;
									if (i8 >= this.length) {
										return -1;
									}
									
									do {
										i9 = class_ob.length - 1;
										while (~i9 <= -1 && this.buffer[i8] == class_ob.buffer[i9]) {
											--i8;
											--i9;
										}
										
										if (~i9 == 0) {
											return i8 + 1;
										}
										
										i8 += Math.max(ints1[this.buffer[i8] & 255], ints[i9]);
									} while (i8 < this.length);
									
									return -1;
								}
								
								ints2[i7 - 1] = i6;
							}
						}
					}
					
					ints2[-1 + length] = i3;
				}
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "ob.M(" + unused + ',' + i + ',' + "{...}" + ')');
		}
	}
	
	final ob getChar(int unused, int charValue) {
		try {
			++e;
			if (charValue > 0 && charValue <= 255) {
				if (!this.j) {
					throw new IllegalArgumentException();
				} else {
					this.h = 0;
					if (~this.buffer.length == ~this.length) {
						int i = 1;
						while (this.length >= i) {
							i += i;
						}
						
						byte[] data = new byte[i];
						p.arrayCopy(this.buffer, 0, data, 0, this.length);
						this.buffer = data;
					}
					
					this.buffer[this.length++] = (byte) charValue;
					return this;
				}
			} else {
				throw new IllegalArgumentException("invalid char:" + charValue);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.H(" + unused + ',' + charValue + ')');
		}
	}
	
	final ob b(Applet var1, byte var2) {
		try {
			++o;
			String var3 = new String(this.buffer, 0, this.length);
			if (var2 < 58) {
				V = null;
			}
			
			String var4 = var1.getParameter(var3);
			return var4 == null ? null : tf.a(var4, 63);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ob.R(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final ob b(boolean var1) {
		int var4 = client.anInt_wb;
		
		try {
			++d;
			if (!var1) {
				this.c((byte) 83);
			}
			
			ob var2 = new ob();
			var2.length = this.length;
			var2.buffer = new byte[this.length];
			int var3 = 0;
			if (var4 != 0) {
				var2.buffer[var3] = 42;
				++var3;
			}
			
			while (~this.length < ~var3) {
				var2.buffer[var3] = 42;
				++var3;
			}
			
			return var2;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ob.G(" + var1 + ')');
		}
	}
	
	final boolean a(int unused, ob class_ob) {
		int dummy = client.anInt_wb;
		
		try {
			++i;
			if (this.length < class_ob.length) {
				return false;
			} else {
				int index = 0;
				if (/*dummy == 0 && */index >= class_ob.length) {
					return true;
				} else {
					do {
						if (~this.buffer[index] != ~class_ob.buffer[index]) {
							return false;
						}
						
						++index;
					} while (index < class_ob.length);
					
					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.I(" + unused + ',' + (class_ob != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean b(byte var1, ob var2) {
		try {
			++ab;
			if (var2 == null) {
				return false;
			} else if (var1 > -52) {
				return false;
			} else if (~var2.length != ~this.length) {
				return false;
			} else {
				for (int var3 = 0; ~var3 > ~this.length; ++var3) {
					byte var4 = this.buffer[var3];
					if (~var4 <= -66 && ~var4 >= -91 || var4 >= -64 && ~var4 >= 33 && ~var4 != 40) {
						var4 = (byte) (var4 + 32);
					}
					
					byte var5 = var2.buffer[var3];
					if (var5 >= 65 && ~var5 >= -91 || ~var5 <= 63 && ~var5 >= 33 && var5 != -41) {
						var5 = (byte) (var5 + 32);
					}
					
					if (~var5 != ~var4) {
						return false;
					}
				}
				
				return true;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ob.BA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean g(byte var1) {
		try {
			int var2 = -7 / ((44 - var1) / 52);
			++X;
			return this.a((int) 10, (byte) 114);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.U(" + var1 + ')');
		}
	}
	
	final ob h(byte var1) {
		int var6 = client.anInt_wb;
		
		try {
			byte var3 = 2;
			ob var2 = new ob();
			++F;
			var2.length = this.length;
			var2.buffer = new byte[this.length];
			int var4 = 0;
			if (var6 == 0 && var4 >= this.length) {
				if (var1 != -43) {
					this.e((int) 58);
				}
				
				return var2;
			} else {
				do {
					byte var5;
					label114:
					{
						var5 = this.buffer[var4];
						if ((var5 < 97 || ~var5 < -123) && (var5 < -32 || var5 > -2 || ~var5 == 8)) {
							label111:
							{
								if (var5 >= 65 && var5 <= 90) {
									if (var3 == 0) {
										var5 = (byte) (var5 + 32);
									}
								} else {
									if (~var5 > 63 || var5 > -34 || var5 == -41) {
										break label111;
									}
									
									if (var3 == 0) {
										var5 = (byte) (var5 + 32);
									}
								}
								
								var3 = 0;
								if (var6 == 0) {
									break label114;
								}
							}
							
							if (~var5 == -47 || ~var5 == -34 || var5 == 63) {
								var3 = 2;
								if (var6 == 0) {
									break label114;
								}
							}
							
							if (~var5 == -33) {
								if (~var3 == -3) {
									break label114;
								}
								
								var3 = 1;
								if (var6 == 0) {
									break label114;
								}
							}
							
							var3 = 1;
							if (var6 == 0) {
								break label114;
							}
						}
						
						if (~var3 == -3) {
							var5 = (byte) (var5 - 32);
						}
						
						var3 = 0;
					}
					
					var2.buffer[var4] = var5;
					++var4;
				} while (var4 < this.length);
				
				if (var1 != -43) {
					this.e((int) 58);
				}
				
				return var2;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ob.D(" + var1 + ')');
		}
	}
	
	final ob i(byte var1) {
		try {
			++m;
			if (!this.j) {
				throw new IllegalArgumentException();
			} else {
				this.h = 0;
				if (var1 < 62) {
					this.c((ob) null, (byte) 64);
				}
				
				if (this.length != this.buffer.length) {
					byte[] var2 = new byte[this.length];
					p.arrayCopy((byte[]) this.buffer, 0, (byte[]) var2, 0, this.length);
					this.buffer = var2;
				}
				
				return this;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ob.PA(" + var1 + ')');
		}
	}
	
	static Class a(String paramString) {
		try {
			return Class.forName(paramString);
		} catch (ClassNotFoundException localClassNotFoundException) {
			throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
		}
	}
	
}
