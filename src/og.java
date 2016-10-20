import java.math.BigInteger;
import java.util.Arrays;

class og extends vd {
	
	static int o = 0;
	static int p;
	static int q;
	static int r;
	static kc s;
	static int t;
	static int u = 2;
	static int[] v;
	static int[] w;
	static int[] x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int E;
	static int[] F;
	static int G;
	static int H;
	static int I;
	static int J;
	static int K;
	static int L;
	static int M;
	static int N;
	static int O;
	static int P;
	static int[] Q;
	static int R;
	static int S;
	static int T;
	static int U;
	static int V;
	static int W;
	static int X;
	static int Y;
	static int[] Z;
	static int ab;
	static int bb;
	static int cb = 50;
	static int db = 0;
	static ob eb;
	static int fb = 0;
	static int gb;
	static int[] hb;
	static int ib;
	private static ob jb;
	static int kb;
	static int anInt_lb;
	static int mb;
	static int nb;
	static int ob;
	static int pb;
	static ob[] qb;
	static int rb;
	static int sb;
	static int tb;
	static ra ub;
	static int vb;
	static int wb;
	static int xb;
	static int yb;
	static int zb;
	static int Ab;
	byte[] buffer;
	static int Cb;
	static int Db;
	static int Eb;
	static int Fb;
	static int Gb;
	int pointer;
	
	final int readSignedLEShort(int var1) {
		try {
			this.pointer += 2;
			int value = (this.buffer[this.pointer - 1] << 8 & '\uff00') + (0xff & this.buffer[-2 + this.pointer]);
			if (value > 32767) {
				value -= 65536;
			}
			
			++V;
			return var1 <= 71 ? -18 : value;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.AB(" + var1 + ')');
		}
	}
	
	final void b(int var1, int var2) {
		try {
			this.buffer[this.pointer++] = (byte) (var1 >> 8);
			this.buffer[this.pointer++] = (byte) var1;
			++W;
			if (var2 != -2100837416) {
				o = 92;
			}
			
			this.buffer[this.pointer++] = (byte) (var1 >> 24);
			this.buffer[this.pointer++] = (byte) (var1 >> 16);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.EB(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int readUnsignedShort(byte var1) {
		try {
			++t;
			this.pointer += 2;
			return (this.buffer[this.pointer + -1] << 8 & '\uff00') + (0xff & this.buffer[this.pointer - 2]);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.S(" + var1 + ')');
		}
	}
	
	final void a(byte var1, int var2) {
		try {
			this.buffer[this.pointer++] = (byte) (-var2);
			if (var1 == -72) {
				++zb;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.L(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int readUByteC(byte var1) {
		try {
			++Ab;
			return 0xff & -this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.R(" + var1 + ')');
		}
	}
	
	final void a(int unused2, byte[] data, int position, boolean unused) {
		try {
			for (int index = position + -1; ~index <= ~0; --index) {
				data[index] = (byte) (this.buffer[this.pointer++] - 128);
			}
			
			++Y;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "og.FB(" + unused2 + ',' + (data != null ? "{...}" : "null") + ',' + position + ',' + unused + ')');
		}
	}
	
	final void c(int var1, int var2) {
		try {
			this.buffer[-4 + -var2 + this.pointer] = (byte) (var2 >> 24);
			++T;
			this.buffer[-var2 + this.pointer + -3] = (byte) (var2 >> 16);
			this.buffer[this.pointer + -var2 - 2] = (byte) (var2 >> 8);
			this.buffer[-var2 + (this.pointer - 1)] = (byte) var2;
			if (var1 < 77) {
				this.readShort(85);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.LA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void writeInt(int var1, byte var2) {
		try {
			++N;
			this.buffer[this.pointer++] = (byte) (var1 >> 24);
			this.buffer[this.pointer++] = (byte) (var1 >> 16);
			this.buffer[this.pointer++] = (byte) (var1 >> 8);
			this.buffer[this.pointer++] = (byte) var1;
			System.out.println("writeInt(" + var1 + ")");
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.DA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final byte e(int var1) {
		try {
			++anInt_lb;
			if (var1 != 1844990088) {
				o = 89;
			}
			
			return (byte) (-this.buffer[this.pointer++]);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.PA(" + var1 + ')');
		}
	}
	
	final void d(int var1, int var2) {
		try {
			this.buffer[this.pointer++] = (byte) (var2 >> 8);
			this.buffer[this.pointer++] = (byte) var2;
			++Eb;
			if (var1 != 26894) {
				fb = 15;
			}
			System.out.println("writeShort(" + var2 + ")");
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.BA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void c(int var1, byte var2) {
		try {
			if (var2 != 17) {
				Z = null;
			}
			
			this.buffer[this.pointer + (-var1 - 1)] = (byte) var1;
			++wb;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.EA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int f(int var1) {
		try {
			if (var1 != -711444088) {
				return 50;
			} else {
				++Cb;
				return 128 + -this.buffer[this.pointer++] & 255;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.GA(" + var1 + ')');
		}
	}
	
	final void e(int var1, int var2) {
		try {
			this.buffer[this.pointer++] = (byte) var1;
			++z;
			this.buffer[this.pointer++] = (byte) (var1 >> 8);
			if (var2 == 1198513704) {
				this.buffer[this.pointer++] = (byte) (var1 >> 16);
				this.buffer[this.pointer++] = (byte) (var1 >> 24);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.B(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void f(int var1, int var2) {
		try {
			if (var2 == -1543) {
				this.buffer[this.pointer++] = (byte) (128 + -var1);
				++G;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.W(" + var1 + ',' + var2 + ')');
		}
	}
	
	final long readLong(int unused) {
		try {
			++K;
			long l = 0xffffffffL & (long) this.readInt(1029109968);
			long l1 = 0xffffffffL & (long) this.readInt(1029109968);
			return (l << 32) + l1;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "og.UA(" + unused + ')');
		}
	}
	
	final void writeLong(int var1, long var2) {
		try {
			++q;
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 56));
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 48));
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 40));
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 32));
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 24));
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 16));
			this.buffer[this.pointer++] = (byte) ((int) (var2 >> 8));
			this.buffer[this.pointer++] = (byte) ((int) var2);
			System.out.println("writeLong(" + var2 + ")");
		} catch (RuntimeException var5) {
			throw bc.a(var5, "og.CB(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int readInt(int unused) {
		try {
			this.pointer += 4;
			++U;
			return (this.buffer[this.pointer - 2] << 8 & '\uff00')
					+ (((this.buffer[this.pointer - 4] & 255) << 24)
					+ ((this.buffer[this.pointer - 3] & 255) << 16)
					+ (255 & this.buffer[this.pointer - 1]));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.HA(" + unused + ')');
		}
	}
	
	final void a(byte var1, BigInteger var2, BigInteger var3) {
		try {
			++Gb;
			int var4 = this.pointer;
			this.pointer = 0;
			byte[] var5 = new byte[var4];
			if (var1 == 110) {
				this.readBytes(var4, 0, var1 + 6, var5);
				BigInteger var6 = new BigInteger(var5);
				BigInteger var7 = var6/*var6.modPow(var2, var3)*/;
				byte[] var8 = var7.toByteArray();
				this.pointer = 0;
				this.writeByte(82, var8.length);
				this.writeBytes(var8.length, var8, 2, 0);
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "og.DB(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void b(byte var1, int var2) {
		try {
			++R;
			if (~(var2 & -128) != -1) {
				if (~(-16384 & var2) != -1) {
					if ((var2 & -2097152) != 0) {
						if (~(var2 & -268435456) != -1) {
							this.writeByte(var1 ^ -21, 128 | var2 >>> 28);
						}
						
						this.writeByte(var1 ^ -51, (269143312 | var2) >>> 21);
					}
					
					this.writeByte(97, (var2 | 2112851) >>> 14);
				}
				
				this.writeByte(108, var2 >>> 7 | 128);
			}
			
			if (var1 == -124) {
				this.writeByte(76, var2 & 127);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.C(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int readUnsignedShortA(byte var1) {
		try {
			++I;
			this.pointer += 2;
			return (0xff & this.buffer[-2 + this.pointer] - 128) + ((this.buffer[-1 + this.pointer] & 0xff) << 8);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.F(" + var1 + ')');
		}
	}
	
	final int a(boolean var1) {
		int var4 = client.anInt_wb;
		
		try {
			++rb;
			byte var2 = this.buffer[this.pointer++];
			if (var1) {
				return 127;
			} else {
				int var3 = 0;
				if (var4 != 0) {}
				if (/*var4 == 0 && */~var2 <= -1) {
					return var3 | var2;
				} else {
					do {
						var3 = (127 & var2 | var3) << 7;
						var2 = this.buffer[this.pointer++];
					} while (~var2 > -1);
					
					return var3 | var2;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "og.E(" + var1 + ')');
		}
	}
	
	final ob i(int unused) {
		try {
			++gb;
			if (this.buffer[this.pointer] == 0) {
				++this.pointer;
				return null;
			} else {
				return this.t(-19405);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.O(" + unused + ')');
		}
	}
	
	final int readInt_V1(byte unused) {
		try {
			++M;
			this.pointer += 4;
			return (this.buffer[this.pointer - 3] & 255)
					+ ((255 & this.buffer[this.pointer - 2]) << 24)
					- (-(16711680 & this.buffer[this.pointer - 1] << 16)
					+ -((this.buffer[this.pointer - 4] & 255) << 8));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.AA(" + unused + ')');
		}
	}
	
	final void writeInt_V2(int value, boolean unused) {
		try {
			++L;
			this.buffer[this.pointer++] = (byte) (value >> 16);
			this.buffer[this.pointer++] = (byte) (value >> 24);
			this.buffer[this.pointer++] = (byte) value;
			this.buffer[this.pointer++] = (byte) (value >> 8);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.VA(" + value + ',' + unused + ')');
		}
	}
	
	final void writeBytes(int length, byte[] bytes, int unused, int pos) {
		int var6 = client.anInt_wb;
		
		try {
			int pos1 = pos;
			if (/*var6 == 0 && */pos >= pos + length) {
				++D;
			} else {
				do {
					this.buffer[this.pointer++] = bytes[pos1];
					++pos1;
				} while (pos1 < pos + length);
				
				++D;
				System.out.println("writeBytes(" + length + " " + Arrays.toString(bytes) + " " + pos);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "og.SA(" + length + ',' + (bytes != null ? "{...}" : "null") + ',' + unused + ',' + pos + ')');
		}
	}
	
	final int j(int var1) {
		try {
			this.pointer += 4;
			++ab;
			return (this.buffer[-4 + this.pointer] & 255)
					+ (-16777216 & this.buffer[this.pointer - 1] << 24)
					- -((this.buffer[-2 + this.pointer] & 255) << 16)
					+ (this.buffer[this.pointer - 3] << 8 & '\uff00');
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.RA(" + var1 + ')');
		}
	}
	
	final void g(int var1, int var2) {
		try {
			if (var1 < 24) {
				o = 35;
			}
			
			++bb;
			this.buffer[this.pointer++] = (byte) (var2 - -128);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.A(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int e(byte var1) {
		try {
			++r;
			if (var1 <= 71) {
				this.readBytes(25, -62, 86, (byte[]) null);
			}
			
			int var2 = this.buffer[this.pointer] & 255;
			return var2 >= 128 ? this.readShort(92) - '쀀' : -64 + this.readUnsignedByte(255);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.MA(" + var1 + ')');
		}
	}
	
	final int readUnsignedByte(int var1) {
		try {
			++Db;
			return 0xff & this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.HB(" + var1 + ')');
		}
	}
	
	final int readSignedShort(byte unused) {
		try {
			this.pointer += 2;
			int value = (this.buffer[this.pointer - 1] & 255) + ((this.buffer[this.pointer - 2] & 255) << 8);
			if (~value < -32768) {
				value -= 65536;
			}
			
			++Fb;
			return value;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.QA(" + unused + ')');
		}
	}
	
	final int h(int var1, int var2) {
		try {
			++tb;
			int var3 = cd.a(this.buffer, this.pointer, -17062, var1);
			int var4 = 37 % ((var2 - -19) / 37);
			this.writeInt(var3, (byte) -123);
			return var3;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "og.K(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void i(int var1, int var2) {
		try {
			if (var1 >= -101) {
				this.readUnsignedByteS(26);
			}
			
			++J;
			this.buffer[this.pointer++] = (byte) var2;
			this.buffer[this.pointer++] = (byte) (var2 >> 8);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.M(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void xteaDecrypt(byte unused, int var2, int[] xteaData, int length) {
		try {
			int var5 = this.pointer;
			this.pointer = var2;
			int var6 = (-var2 + length) / 8;
			++pb;
			for (int var8 = 0; var8 < var6; ++var8) {
				int var9 = this.readInt(1029109968);
				int var11 = -957401312;
				int var10 = this.readInt(1029109968);
				int var12 = -1640531527;
				
				System.out.println("xtea decrypt: " + var9 + " " + var10 + " " + Arrays.toString(xteaData));
				for (int var13 = 32; ~(var13--) < -1; var9 -= (var10 >>> 5 ^ var10 << 4) - -var10 ^ var11 + xteaData[var11 & 3]) {
					var10 -= (var9 << 4 ^ var9 >>> 5) - -var9 ^ xteaData[(var11 & 7441) >>> 11] + var11;
					var11 -= var12;
				}
				
				this.pointer -= 8;
				this.writeInt(var9, (byte) -121);
				this.writeInt(var10, (byte) -121);
			}
			
			this.pointer = var5;
		} catch (RuntimeException var14) {
			throw bc.a(var14, "og.GB(" + unused + ',' + var2 + ',' + (xteaData != null ? "{...}" : "null") + ',' + length + ')');
		}
	}
	
	final void a(byte var1, long var2) {
		try {
			if (var1 != 80) {
				cb = -30;
			}
			
			this.e((int) (var2 >> 32), 1198513704);
			this.e((int) var2, 1198513704);
			++O;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "og.NA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void writeByte(int var1, int value) {
		try {
			this.buffer[this.pointer++] = (byte) value;
			System.out.println("writeByte(" + value + ")");
			++mb;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.V(" + var1 + ',' + value + ')');
		}
	}
	
	public static void l(int var0) {
		try {
			jb = null;
			w = null;
			v = null;
			eb = null;
			Z = null;
			hb = null;
			qb = null;
			F = null;
			x = null;
			Q = null;
			ub = null;
			s = null;
			if (var0 != 1013841624) {
				cb = -119;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "og.N(" + var0 + ')');
		}
	}
	
	final void writeString(ob ob, byte var2) {
		try {
			++p;
			this.pointer += ob.a(ob.a(false), (byte) 96, 0, this.pointer, this.buffer);
			this.buffer[this.pointer++] = 0;
			System.out.println("writeString()");
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.J(" + (ob != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final byte readByte(int var1) {
		try {
			++B;
			return this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.IA(" + var1 + ')');
		}
	}
	
	final void readBytes(int var1, int var2, int var3, byte[] var4) {
		try {
			++S;
			
			for (int var5 = var2; ~var5 > ~(var1 + var2); ++var5) {
				var4[var5] = this.buffer[this.pointer++];
			}
			
			if (var3 <= 89) {
				this.g((byte) -4);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "og.WA(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int readUnsignedByteS(int var1) {
		try {
			if (var1 != -8544) {
				this.e((byte) 106);
			}
			
			++A;
			return 255 & this.buffer[this.pointer++] - 128;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.FA(" + var1 + ')');
		}
	}
	
	final int g(byte var1) {
		try {
			if (var1 < 121) {
				v = null;
			}
			
			this.pointer += 2;
			++ob;
			int var2 = ('\uff00' & this.buffer[this.pointer - 1] << 8) - -(-128 + this.buffer[this.pointer + -2] & 255);
			if (var2 > 32767) {
				var2 -= 65536;
			}
			
			return var2;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.KA(" + var1 + ')');
		}
	}
	
	final void k(int var1, int var2) {
		try {
			this.buffer[this.pointer++] = (byte) (var2 >> 8);
			++kb;
			if (var1 > -89) {
				o = -6;
			}
			
			this.buffer[this.pointer++] = (byte) (var2 + 128);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.P(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int o(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			++nb;
			int var3 = this.r(-2);
			int var2 = 0;
			if (var4 != 0) {
				var2 += 32767;
				var3 = this.r(-2);
			}
			
			while (var3 == 32767) {
				var2 += 32767;
				var3 = this.r(-2);
			}
			
			if (var1 >= -30) {
				x = null;
			}
			
			var2 += var3;
			return var2;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "og.H(" + var1 + ')');
		}
	}
	
	final int p(int var1) {
		try {
			if (var1 != -1234576288) {
				this.readUnsignedByte(51);
			}
			
			this.pointer += 4;
			++X;
			return (this.buffer[this.pointer - 1] << 8 & '\uff00') + ((this.buffer[this.pointer - 4] & 255) << 16) + ((this.buffer[-3 + this.pointer] & 255) << 24) + (255 & this.buffer[this.pointer + -2]);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.U(" + var1 + ')');
		}
	}
	
	final int readShort (int var1) {
		try {
			++ib;
			this.pointer += 2;
			return (this.buffer[this.pointer - 1] & 0xff)
					+ (this.buffer[this.pointer - 2] << 8 & '\uff00');
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.I(" + var1 + ')');
		}
	}
	
	final void l(int var1, int var2) {
		try {
			++vb;
			if (~var2 <= -1 && ~var2 > -129) {
				this.writeByte(113, var2);
			} else if (var2 >= 0 && ~var2 > -32769) {
				this.d(var1 + 26886, var2 + '耀');
			} else {
				if (var1 != 8) {
					this.h(-21, 124);
				}
				
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.D(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void m(int var1, int var2) {
		try {
			++P;
			int var3 = 56 % ((-51 - var1) / 48);
			this.buffer[this.pointer++] = (byte) (var2 - -128);
			this.buffer[this.pointer++] = (byte) (var2 >> 8);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int r(int var1) {
		try {
			++C;
			if (var1 != -2) {
				return -101;
			} else {
				int var2 = this.buffer[this.pointer] & 255;
				return ~var2 > -129 ? this.readUnsignedByte(255) : -32768 + this.readShort(76);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.T(" + var1 + ')');
		}
	}
	
	final void writeMedInt(int unused, int value) {
		try {
			++yb;
			this.buffer[this.pointer++] = (byte) (value >> 16);
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) value;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "og.TA(" + unused + ',' + value + ')');
		}
	}
	
	final int readUnsignedMedInt(int unused) {
		try {
			++H;
			this.pointer += 3;
			return (255 & this.buffer[this.pointer - 1])
					+ (((this.buffer[this.pointer - 3] & 255) << 16)
					+ ((this.buffer[this.pointer - 2] & 255) << 8));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.CA(" + unused + ')');
		}
	}
	
	final ob t(int unused) {
		try {
			int var2 = this.pointer;
			++xb;
			
			while (this.buffer[this.pointer++] != 0) {
				;
			}
			return sc.a(1, var2, this.buffer, this.pointer + -var2 + -1);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.Q(" + unused + ')');
		}
	}
	
	final byte u(int var1) {
		try {
			++sb;
			if (var1 > -70) {
				w = null;
			}
			
			return (byte) (-this.buffer[this.pointer++] + 128);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.JA(" + var1 + ')');
		}
	}
	
	final int readUnsignedLEShortA(byte var1) {
		try {
			this.pointer += 2;
			++E;
			return (this.buffer[this.pointer - 1] + -128 & 0xff) + ('\uff00' & this.buffer[this.pointer - 2] << 8);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.BB(" + var1 + ')');
		}
	}
	
	static final boolean o(int var0, int var1) {
		try {
			if (var0 != -58) {
				hb = null;
			}
			
			++y;
			return ~var1 <= -49 && ~var1 >= -58;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.OA(" + var0 + ',' + var1 + ')');
		}
	}
	
	og(int var1) {
		try {
			this.buffer = nc.a(var1, 15);
			this.pointer = 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.<init>(" + var1 + ')');
		}
	}
	
	og(byte[] var1) {
		try {
			this.pointer = 0;
			this.buffer = var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "og.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		qb = new ob[cb];
		Z = new int[cb];
		Q = new int[cb];
		w = new int[cb];
		F = new int[cb];
		hb = new int[cb];
		v = new int[cb];
		x = new int[cb];
		jb = rf.a(40, "Connection lost)3");
		eb = jb;
	}
}
