final class cb extends aa {
	
	byte[] O;
	int[][] P;
	private short Q;
	int[] R;
	private byte[] S;
	private static int[] T;
	private byte[] U;
	private short[] V;
	private short W;
	byte[] X;
	private short Y;
	short Z;
	byte[] ab;
	private int[] bb;
	private short cb;
	int[] db;
	private short[] eb;
	short[] fb;
	private static int[] gb;
	short[] hb;
	int ib = 0;
	int[] jb;
	short kb;
	int[] lb;
	private static int[] mb;
	private short nb;
	int ob = 0;
	ba[] pb;
	va[] qb;
	short[] rb;
	private static int[] sb;
	short[] tb;
	private byte[] ub;
	private byte[] vb;
	short[] wb;
	int[] xb;
	private short[] yb;
	int[][] zb;
	int[] Ab;
	byte[] Bb;
	ba[] Cb;
	private short Db;
	private byte[] Eb;
	byte Fb = 0;
	int Gb;
	byte[] Hb;
	private boolean Ib = false;
	private int[] Jb;
	private static int Kb;
	
	private void a(byte[] bytes) {
		og og = new og(bytes);
		og og1 = new og(bytes);
		og og2 = new og(bytes);
		og og3 = new og(bytes);
		og og4 = new og(bytes);
		og og5 = new og(bytes);
		og og6 = new og(bytes);
		og.pointer = bytes.length - 23;
		int i = og.readShort(82);
		int i1 = og.readShort(71);
		int i2 = og.readUnsignedByte(255);
		int i3 = og.readUnsignedByte(255);
		int i4 = og.readUnsignedByte(255);
		int i5 = og.readUnsignedByte(255);
		int i6 = og.readUnsignedByte(255);
		int i7 = og.readUnsignedByte(255);
		int i8 = og.readUnsignedByte(255);
		int i9 = og.readShort(113);
		int i10 = og.readShort(125);
		int i11 = og.readShort(28);
		int i12 = og.readShort(41);
		int i13 = og.readShort(109);
		int i14 = 0;
		int i15 = 0;
		int i16 = 0;
		int i17;
		if (i2 > 0) {
			this.O = new byte[i2];
			og.pointer = 0;
			for (i17 = 0; i17 < i2; ++i17) {
				byte b = this.O[i17] = og.readByte(1064893128);
				if (b == 0) {
					++i14;
				} else if (b >= 1 && b <= 3) {
					++i15;
				} else if (b == 2) {
					++i16;
				}
			}
		}
		
		i17 = i2 + i;
		int i18 = i17;
		if (i3 == 1) {
			i17 += i1;
		}
		
		int i19 = i17;
		i17 += i1;
		int i20 = i17;
		if (i4 == 255) {
			i17 += i1;
		}
		
		int i21 = i17;
		if (i6 == 1) {
			i17 += i1;
		}
		
		int i22 = i17;
		if (i8 == 1) {
			i17 += i;
		}
		
		int i23 = i17;
		if (i5 == 1) {
			i17 += i1;
		}
		
		int i24 = i17;
		i17 += i12;
		int i25 = i17;
		if (i7 == 1) {
			i17 += i1 * 2;
		}
		
		int i26 = i17;
		i17 += i13;
		int i27 = i17;
		i17 += i1 * 2;
		int i28 = i17;
		i17 += i9;
		int i29 = i17;
		i17 += i10;
		int i30 = i17;
		i17 += i11;
		int i31 = i17;
		i17 += i14 * 6;
		int i32 = i17;
		i17 += i15 * 6;
		int i33 = i17;
		i17 += i15 * 6;
		int i34 = i17;
		i17 += i15;
		int i35 = i17;
		i17 += i15;
		int i36 = i17;
		i17 += i15 + i16 * 2;
		this.ob = i;
		this.ib = i1;
		this.Gb = i2;
		this.db = new int[i];
		this.jb = new int[i];
		this.R = new int[i];
		this.lb = new int[i1];
		this.Ab = new int[i1];
		this.xb = new int[i1];
		if (i8 == 1) {
			this.bb = new int[i];
		}
		
		if (i3 == 1) {
			this.X = new byte[i1];
		}
		
		if (i4 == 255) {
			this.Bb = new byte[i1];
		} else {
			this.Fb = (byte) i4;
		}
		
		if (i5 == 1) {
			this.Hb = new byte[i1];
		}
		
		if (i6 == 1) {
			this.Jb = new int[i1];
		}
		
		if (i7 == 1) {
			this.fb = new short[i1];
		}
		
		if (i7 == 1 && i2 > 0) {
			this.ab = new byte[i1];
		}
		
		this.tb = new short[i1];
		if (i2 > 0) {
			this.wb = new short[i2];
			this.rb = new short[i2];
			this.hb = new short[i2];
			if (i15 > 0) {
				this.eb = new short[i15];
				this.yb = new short[i15];
				this.V = new short[i15];
				this.vb = new byte[i15];
				this.Eb = new byte[i15];
				this.U = new byte[i15];
			}
			
			if (i16 > 0) {
				this.ub = new byte[i16];
				this.S = new byte[i16];
			}
		}
		
		og.pointer = i2;
		og1.pointer = i28;
		og2.pointer = i29;
		og3.pointer = i30;
		og4.pointer = i22;
		int i37 = 0;
		int i38 = 0;
		int i39 = 0;
		int i40;
		int i41;
		int i42;
		int i43;
		for (int i44 = 0; i44 < i; ++i44) {
			i40 = og.readUnsignedByte(255);
			i41 = 0;
			if ((i40 & 1) != 0) {
				i41 = og1.e((byte) 121);
			}
			
			i42 = 0;
			if ((i40 & 2) != 0) {
				i42 = og2.e((byte) 124);
			}
			
			i43 = 0;
			if ((i40 & 4) != 0) {
				i43 = og3.e((byte) 77);
			}
			
			this.db[i44] = i37 + i41;
			this.jb[i44] = i38 + i42;
			this.R[i44] = i39 + i43;
			i37 = this.db[i44];
			i38 = this.jb[i44];
			i39 = this.R[i44];
			if (i8 == 1) {
				this.bb[i44] = og4.readUnsignedByte(255);
			}
		}
		
		og.pointer = i27;
		og1.pointer = i18;
		og2.pointer = i20;
		og3.pointer = i23;
		og4.pointer = i21;
		og5.pointer = i25;
		og6.pointer = i26;
		
		for (i40 = 0; i40 < i1; ++i40) {
			this.tb[i40] = (short) og.readShort(97);
			if (i3 == 1) {
				this.X[i40] = og1.readByte(1064893128);
			}
			
			if (i4 == 255) {
				this.Bb[i40] = og2.readByte(1064893128);
			}
			
			if (i5 == 1) {
				this.Hb[i40] = og3.readByte(1064893128);
			}
			
			if (i6 == 1) {
				this.Jb[i40] = og4.readUnsignedByte(255);
			}
			
			if (i7 == 1) {
				this.fb[i40] = (short) (og5.readShort(33) - 1);
			}
			
			if (this.ab != null) {
				if (this.fb[i40] != -1) {
					this.ab[i40] = (byte) (og6.readUnsignedByte(255) - 1);
				} else {
					this.ab[i40] = -1;
				}
			}
		}
		
		og.pointer = i24;
		og1.pointer = i19;
		i41 = 0;
		i42 = 0;
		i43 = 0;
		int i44 = 0;
		int i45;
		int i46;
		for (int i47 = 0; i47 < i1; ++i47) {
			i45 = og1.readUnsignedByte(255);
			if (i45 == 1) {
				i41 = og.e((byte) 113) + i44;
				i42 = og.e((byte) 106) + i41;
				i43 = og.e((byte) 120) + i42;
				i44 = i43;
				this.lb[i47] = i41;
				this.Ab[i47] = i42;
				this.xb[i47] = i43;
			} else if (i45 == 2) {
				i42 = i43;
				i43 = og.e((byte) 83) + i44;
				i44 = i43;
				this.lb[i47] = i41;
				this.Ab[i47] = i42;
				this.xb[i47] = i43;
			} else if (i45 == 3) {
				i41 = i43;
				i43 = og.e((byte) 95) + i44;
				i44 = i43;
				this.lb[i47] = i41;
				this.Ab[i47] = i42;
				this.xb[i47] = i43;
			} else if (i45 == 4) {
				i46 = i41;
				i41 = i42;
				i42 = i46;
				i43 = og.e((byte) 89) + i44;
				i44 = i43;
				this.lb[i47] = i41;
				this.Ab[i47] = i46;
				this.xb[i47] = i43;
			}
		}
		
		og.pointer = i31;
		og1.pointer = i32;
		og2.pointer = i33;
		og3.pointer = i34;
		og4.pointer = i35;
		og5.pointer = i36;
		
		for (i45 = 0; i45 < i2; ++i45) {
			i46 = this.O[i45] & 255;
			if (i46 == 0) {
				this.wb[i45] = (short) og.readShort(47);
				this.rb[i45] = (short) og.readShort(41);
				this.hb[i45] = (short) og.readShort(73);
			} else if (i46 == 1) {
				this.wb[i45] = (short) og1.readShort(81);
				this.rb[i45] = (short) og1.readShort(82);
				this.hb[i45] = (short) og1.readShort(102);
				this.eb[i45] = (short) og2.readShort(43);
				this.yb[i45] = (short) og2.readShort(95);
				this.V[i45] = (short) og2.readShort(63);
				this.vb[i45] = og3.readByte(1064893128);
				this.Eb[i45] = og4.readByte(1064893128);
				this.U[i45] = og5.readByte(1064893128);
			} else if (i46 == 2) {
				this.wb[i45] = (short) og1.readShort(44);
				this.rb[i45] = (short) og1.readShort(76);
				this.hb[i45] = (short) og1.readShort(123);
				this.eb[i45] = (short) og2.readShort(98);
				this.yb[i45] = (short) og2.readShort(40);
				this.V[i45] = (short) og2.readShort(31);
				this.vb[i45] = og3.readByte(1064893128);
				this.Eb[i45] = og4.readByte(1064893128);
				this.U[i45] = og5.readByte(1064893128);
				this.ub[i45] = og5.readByte(1064893128);
				this.S[i45] = og5.readByte(1064893128);
			} else if (i46 == 3) {
				this.wb[i45] = (short) og1.readShort(86);
				this.rb[i45] = (short) og1.readShort(120);
				this.hb[i45] = (short) og1.readShort(111);
				this.eb[i45] = (short) og2.readShort(101);
				this.yb[i45] = (short) og2.readShort(121);
				this.V[i45] = (short) og2.readShort(124);
				this.vb[i45] = og3.readByte(1064893128);
				this.Eb[i45] = og4.readByte(1064893128);
				this.U[i45] = og5.readByte(1064893128);
			}
		}
		
		og.pointer = i17;
		i46 = og.readUnsignedByte(255);
		if (i46 != 0) {
			new ri();
			og.readShort(42);
			og.readShort(120);
			og.readShort(53);
			og.readInt(1029109968);
		}
	}
	
	final void g(int unused) {
		int i = mb[256];
		int i1 = T[256];
		
		for (int index = 0; index < this.ob; ++index) {
			int i3 = this.R[index] * i + this.db[index] * i1 >> 16;
			this.R[index] = this.R[index] * i1 - this.db[index] * i >> 16;
			this.db[index] = i3;
		}
		
		this.j();
	}
	
	private void c() {
		if (!this.Ib) {
			this.Ib = true;
			int i = 32767;
			int i1 = 32767;
			int i2 = 32767;
			int i3 = -32768;
			int i4 = -32768;
			int i5 = -32768;
			for (int i6 = 0; i6 < this.ob; ++i6) {
				int i7 = this.db[i6];
				int i8 = this.jb[i6];
				int i9 = this.R[i6];
				if (i7 < i) {
					i = i7;
				}
				
				if (i7 > i3) {
					i3 = i7;
				}
				
				if (i8 < i1) {
					i1 = i8;
				}
				
				if (i8 > i4) {
					i4 = i8;
				}
				
				if (i9 < i2) {
					i2 = i9;
				}
				
				if (i9 > i5) {
					i5 = i9;
				}
			}
			
			this.Db = (short) i;
			this.Q = (short) i3;
			this.nb = (short) i1;
			this.W = (short) i4;
			this.cb = (short) i2;
			this.Y = (short) i5;
		}
	}
	
	final void a(short s, short s2) {
		if (this.fb != null) {
			for (int index = 0; index < this.ib; ++index) {
				if (this.fb[index] == s) {
					this.fb[index] = s2;
				}
			}
		}
	}
	
	final void d() {
		for (int index = 0; index < this.ob; ++index) {
			int i = this.db[index];
			this.db[index] = this.R[index];
			this.R[index] = -i;
		}
		
		this.j();
	}
	
	static cb a(pe pe, int i, int i1) {
		byte[] bytes = pe.a((byte) -122, i1, i);
		return bytes == null ? null : new cb(bytes);
	}
	
	final cb a(int[][] ints, int i, int i1, int i2, boolean unused, int i3, boolean unused2) {
		this.c();
		int i4 = i + this.Db;
		int i5 = i + this.Q;
		int i6 = i2 + this.cb;
		int i7 = i2 + this.Y;
		if (i4 >= 0 && i5 + 128 >> 7 < ints.length && i6 >= 0 && i7 + 128 >> 7 < ints[0].length) {
			i4 >>= 7;
			i5 = i5 + 127 >> 7;
			i6 >>= 7;
			i7 = i7 + 127 >> 7;
			if (ints[i4][i6] == i1 && ints[i5][i6] == i1 && ints[i4][i7] == i1 && ints[i5][i7] == i1) {
				return this;
			} else {
				cb cb;
				cb = new cb();
				cb.ob = this.ob;
				cb.ib = this.ib;
				cb.Gb = this.Gb;
				cb.db = this.db;
				cb.R = this.R;
				cb.lb = this.lb;
				cb.Ab = this.Ab;
				cb.xb = this.xb;
				cb.X = this.X;
				cb.Bb = this.Bb;
				cb.Hb = this.Hb;
				cb.ab = this.ab;
				cb.tb = this.tb;
				cb.fb = this.fb;
				cb.Fb = this.Fb;
				cb.O = this.O;
				cb.wb = this.wb;
				cb.rb = this.rb;
				cb.hb = this.hb;
				cb.eb = this.eb;
				cb.yb = this.yb;
				cb.V = this.V;
				cb.vb = this.vb;
				cb.Eb = this.Eb;
				cb.U = this.U;
				cb.ub = this.ub;
				cb.S = this.S;
				cb.bb = this.bb;
				cb.Jb = this.Jb;
				cb.P = this.P;
				cb.zb = this.zb;
				cb.Z = this.Z;
				cb.kb = this.kb;
				cb.pb = this.pb;
				cb.qb = this.qb;
				cb.Cb = this.Cb;
				cb.jb = new int[cb.ob];
				int i8;
				int i9;
				int i10;
				int i11;
				int i12;
				int i13;
				int i14;
				int i15;
				int i16;
				int i17;
				if (i3 == 0) {
					for (i8 = 0; i8 < cb.ob; ++i8) {
						i9 = this.db[i8] + i;
						i10 = this.R[i8] + i2;
						i11 = i9 & 127;
						i12 = i10 & 127;
						i13 = i9 >> 7;
						i14 = i10 >> 7;
						i15 = ints[i13][i14] * (128 - i11) + ints[i13 + 1][i14] * i11 >> 7;
						i16 = ints[i13][i14 + 1] * (128 - i11) + ints[i13 + 1][i14 + 1] * i11 >> 7;
						i17 = i15 * (128 - i12) + i16 * i12 >> 7;
						cb.jb[i8] = this.jb[i8] + i17 - i1;
					}
				} else {
					for (i8 = 0; i8 < cb.ob; ++i8) {
						i9 = (this.jb[i8] << 16) / this.nb;
						if (i9 < i3) {
							i10 = this.db[i8] + i;
							i11 = this.R[i8] + i2;
							i12 = i10 & 127;
							i13 = i11 & 127;
							i14 = i10 >> 7;
							i15 = i11 >> 7;
							i16 = ints[i14][i15] * (128 - i12) + ints[i14 + 1][i15] * i12 >> 7;
							i17 = ints[i14][i15 + 1] * (128 - i12) + ints[i14 + 1][i15 + 1] * i12 >> 7;
							int i18 = i16 * (128 - i13) + i17 * i13 >> 7;
							cb.jb[i8] = this.jb[i8] + (i18 - i1) * (i3 - i9) / i3;
						} else {
							cb.jb[i8] = this.jb[i8];
						}
					}
				}
				
				this.Ib = false;
				return cb;
			}
		} else {
			return this;
		}
	}
	
	final aa b(int i, int i1, int i2) {
		return this.b(this.Z, this.kb, i, i1, i2);
	}
	
	final boolean a() {
		return true;
	}
	
	private int a(cb cb, int i) {
		int i1 = -1;
		int i2 = cb.db[i];
		int i3 = cb.jb[i];
		int i4 = cb.R[i];
		for (int index = 0; index < this.ob; ++index) {
			if (i2 == this.db[index] && i3 == this.jb[index] && i4 == this.R[index]) {
				i1 = index;
				break;
			}
		}
		
		if (i1 == -1) {
			this.db[this.ob] = i2;
			this.jb[this.ob] = i3;
			this.R[this.ob] = i4;
			if (cb.bb != null) {
				this.bb[this.ob] = cb.bb[i];
			}
			
			i1 = this.ob++;
		}
		
		return i1;
	}
	
	final he a(int i, int i1, int i2, int i3, int i4) {
		return new he(this, i, i1, i2, i3, i4);
	}
	
	final void c(int i, int i1, int i2) {
		for (int index = 0; index < this.ob; ++index) {
			this.db[index] += i;
			this.jb[index] += i1;
			this.R[index] += i2;
		}
		
		this.j();
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		System.err.println("Method a(int, int, int, int, int, int, int, int, long) [Class cb] empty");
	}
	
	final void e() {
		for (int index = 0; index < this.ob; ++index) {
			int i = this.R[index];
			this.R[index] = this.db[index];
			this.db[index] = -i;
		}
		
		this.j();
	}
	
	final cb f() {
		cb cb = new cb();
		if (this.X != null) {
			cb.X = new byte[this.ib];
			System.arraycopy(this.X, 0, cb.X, 0, this.ib);
		}
		
		cb.ob = this.ob;
		cb.ib = this.ib;
		cb.Gb = this.Gb;
		cb.db = this.db;
		cb.jb = this.jb;
		cb.R = this.R;
		cb.lb = this.lb;
		cb.Ab = this.Ab;
		cb.xb = this.xb;
		cb.Bb = this.Bb;
		cb.Hb = this.Hb;
		cb.ab = this.ab;
		cb.tb = this.tb;
		cb.fb = this.fb;
		cb.Fb = this.Fb;
		cb.O = this.O;
		cb.wb = this.wb;
		cb.rb = this.rb;
		cb.hb = this.hb;
		cb.eb = this.eb;
		cb.yb = this.yb;
		cb.V = this.V;
		cb.vb = this.vb;
		cb.Eb = this.Eb;
		cb.U = this.U;
		cb.ub = this.ub;
		cb.S = this.S;
		cb.bb = this.bb;
		cb.Jb = this.Jb;
		cb.P = this.P;
		cb.zb = this.zb;
		cb.pb = this.pb;
		cb.qb = this.qb;
		cb.Z = this.Z;
		cb.kb = this.kb;
		return cb;
	}
	
	final int b() {
		if (!this.Ib) {
			this.c();
		}
		
		return this.nb;
	}
	
	final void g() {
		int[] ints;
		int i;
		int i1;
		int i2;
		int i3;
		int i4;
		if (this.bb != null) {
			ints = new int[256];
			i = 0;
			
			for (i1 = 0; i1 < this.ob; ++i1) {
				i2 = this.bb[i1];
				++ints[i2];
				if (i2 > i) {
					i = i2;
				}
			}
			
			this.P = new int[i + 1][];
			
			for (i2 = 0; i2 <= i; ++i2) {
				this.P[i2] = new int[ints[i2]];
				ints[i2] = 0;
			}
			
			for (i3 = 0; i3 < this.ob; this.P[i4][ints[i4]++] = i3++) {
				i4 = this.bb[i3];
			}
			
			this.bb = null;
		}
		
		if (this.Jb != null) {
			ints = new int[256];
			i = 0;
			
			for (i1 = 0; i1 < this.ib; ++i1) {
				i2 = this.Jb[i1];
				++ints[i2];
				if (i2 > i) {
					i = i2;
				}
			}
			
			this.zb = new int[i + 1][];
			
			for (i2 = 0; i2 <= i; ++i2) {
				this.zb[i2] = new int[ints[i2]];
				ints[i2] = 0;
			}
			
			for (i3 = 0; i3 < this.ib; this.zb[i4][ints[i4]++] = i3++) {
				i4 = this.Jb[i3];
			}
			
			this.Jb = null;
		}
	}
	
	final void h() {
		for (int index = 0; index < this.ob; ++index) {
			this.R[index] = -this.R[index];
		}
		
		for (int index = 0; index < this.ib; ++index) {
			int i = this.lb[index];
			this.lb[index] = this.xb[index];
			this.xb[index] = i;
		}
		
		this.j();
	}
	
	final void i() {
		if (this.pb == null) {
			this.pb = new ba[this.ob];
			
			for (int index = 0; index < this.ob; ++index) {
				this.pb[index] = new ba();
			}
			
			for (int i = 0; i < this.ib; ++i) {
				int i1 = this.lb[i];
				int i2 = this.Ab[i];
				int i3 = this.xb[i];
				int i4 = this.db[i2] - this.db[i1];
				int i5 = this.jb[i2] - this.jb[i1];
				int i6 = this.R[i2] - this.R[i1];
				int i7 = this.db[i3] - this.db[i1];
				int i8 = this.jb[i3] - this.jb[i1];
				int i9 = this.R[i3] - this.R[i1];
				int i10 = i5 * i9 - i8 * i6;
				int i11 = i6 * i7 - i9 * i4;
				int i12;
				for (i12 = i4 * i8 - i7 * i5; i10 > 8192 || i11 > 8192
						|| i12 > 8192 || i10 < -8192 || i11 < -8192 || i12 < -8192; i12 >>= 1) {
					i10 >>= 1;
					i11 >>= 1;
				}
				
				int i13 = (int) Math.sqrt((double) (i10 * i10 + i11 * i11 + i12 * i12));
				if (i13 <= 0) {
					i13 = 1;
				}
				
				i10 = i10 * 256 / i13;
				i11 = i11 * 256 / i13;
				i12 = i12 * 256 / i13;
				byte b;
				if (this.X == null) {
					b = 0;
				} else {
					b = this.X[i];
				}
				
				if (b == 0) {
					ba ba = this.pb[i1];
					ba.f += i10;
					ba.g += i11;
					ba.anInt_d += i12;
					++ba.e;
					ba = this.pb[i2];
					ba.f += i10;
					ba.g += i11;
					ba.anInt_d += i12;
					++ba.e;
					ba = this.pb[i3];
					ba.f += i10;
					ba.g += i11;
					ba.anInt_d += i12;
					++ba.e;
				} else if (b == 1) {
					if (this.qb == null) {
						this.qb = new va[this.ib];
					}
					
					va va = this.qb[i] = new va();
					va.d = i10;
					va.b = i11;
					va.a = i12;
				}
			}
		}
	}
	
	final void b(short s, short s2) {
		for (int index = 0; index < this.ib; ++index) {
			if (this.tb[index] == s) {
				this.tb[index] = s2;
			}
		}
	}
	
	private void j() {
		this.pb = null;
		this.Cb = null;
		this.qb = null;
		this.Ib = false;
	}
	
	private void b(byte[] bytes) {
		boolean var2 = false;
		boolean var3 = false;
		og var4 = new og(bytes);
		og var5 = new og(bytes);
		og var6 = new og(bytes);
		og var7 = new og(bytes);
		og var8 = new og(bytes);
		var4.pointer = bytes.length - 18;
		int var9 = var4.readShort(72);
		int var10 = var4.readShort(69);
		int var11 = var4.readUnsignedByte(255);
		int var12 = var4.readUnsignedByte(255);
		int var13 = var4.readUnsignedByte(255);
		int var14 = var4.readUnsignedByte(255);
		int var15 = var4.readUnsignedByte(255);
		int var16 = var4.readUnsignedByte(255);
		int var17 = var4.readShort(118);
		int var18 = var4.readShort(120);
		int var19 = var4.readShort(102);
		int var20 = var4.readShort(116);
		byte var21 = 0;
		int var49 = var21 + var9;
		int var23 = var49;
		var49 += var10;
		int var24 = var49;
		if (var13 == 255) {
			var49 += var10;
		}
		
		int var25 = var49;
		if (var15 == 1) {
			var49 += var10;
		}
		
		int var26 = var49;
		if (var12 == 1) {
			var49 += var10;
		}
		
		int var27 = var49;
		if (var16 == 1) {
			var49 += var9;
		}
		
		int var28 = var49;
		if (var14 == 1) {
			var49 += var10;
		}
		
		int var29 = var49;
		var49 += var20;
		int var30 = var49;
		var49 += var10 * 2;
		int var31 = var49;
		var49 += var11 * 6;
		int var32 = var49;
		var49 += var17;
		int var33 = var49;
		var49 += var18;
		int var10000 = var49 + var19;
		this.ob = var9;
		this.ib = var10;
		this.Gb = var11;
		this.db = new int[var9];
		this.jb = new int[var9];
		this.R = new int[var9];
		this.lb = new int[var10];
		this.Ab = new int[var10];
		this.xb = new int[var10];
		if (var11 > 0) {
			this.O = new byte[var11];
			this.wb = new short[var11];
			this.rb = new short[var11];
			this.hb = new short[var11];
		}
		
		if (var16 == 1) {
			this.bb = new int[var9];
		}
		
		if (var12 == 1) {
			this.X = new byte[var10];
			this.ab = new byte[var10];
			this.fb = new short[var10];
		}
		
		if (var13 == 255) {
			this.Bb = new byte[var10];
		} else {
			this.Fb = (byte) var13;
		}
		
		if (var14 == 1) {
			this.Hb = new byte[var10];
		}
		
		if (var15 == 1) {
			this.Jb = new int[var10];
		}
		
		this.tb = new short[var10];
		var4.pointer = var21;
		var5.pointer = var32;
		var6.pointer = var33;
		var7.pointer = var49;
		var8.pointer = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;
		
		int var39;
		int var40;
		int var41;
		int var42;
		for (int var38 = 0; var38 < var9; ++var38) {
			var39 = var4.readUnsignedByte(255);
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.e((byte) 100);
			}
			
			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.e((byte) 103);
			}
			
			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.e((byte) 105);
			}
			
			this.db[var38] = var35 + var40;
			this.jb[var38] = var36 + var41;
			this.R[var38] = var37 + var42;
			var35 = this.db[var38];
			var36 = this.jb[var38];
			var37 = this.R[var38];
			if (var16 == 1) {
				this.bb[var38] = var8.readUnsignedByte(255);
			}
		}
		
		var4.pointer = var30;
		var5.pointer = var26;
		var6.pointer = var24;
		var7.pointer = var28;
		var8.pointer = var25;
		
		for (var39 = 0; var39 < var10; ++var39) {
			this.tb[var39] = (short) var4.readShort(55);
			if (var12 == 1) {
				var40 = var5.readUnsignedByte(255);
				if ((var40 & 1) == 1) {
					this.X[var39] = 1;
					var2 = true;
				} else {
					this.X[var39] = 0;
				}
				
				if ((var40 & 2) == 2) {
					this.ab[var39] = (byte) (var40 >> 2);
					this.fb[var39] = this.tb[var39];
					this.tb[var39] = 127;
					if (this.fb[var39] != -1) {
						var3 = true;
					}
				} else {
					this.ab[var39] = -1;
					this.fb[var39] = -1;
				}
			}
			
			if (var13 == 255) {
				this.Bb[var39] = var6.readByte(1064893128);
			}
			
			if (var14 == 1) {
				this.Hb[var39] = var7.readByte(1064893128);
			}
			
			if (var15 == 1) {
				this.Jb[var39] = var8.readUnsignedByte(255);
			}
		}
		
		var4.pointer = var29;
		var5.pointer = var23;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		int var43 = 0;
		
		int var45;
		for (int var44 = 0; var44 < var10; ++var44) {
			var45 = var5.readUnsignedByte(255);
			if (var45 == 1) {
				var40 = var4.e((byte) 87) + var43;
				var41 = var4.e((byte) 81) + var40;
				var42 = var4.e((byte) 102) + var41;
				var43 = var42;
				this.lb[var44] = var40;
				this.Ab[var44] = var41;
				this.xb[var44] = var42;
			}
			
			if (var45 == 2) {
				var41 = var42;
				var42 = var4.e((byte) 79) + var43;
				var43 = var42;
				this.lb[var44] = var40;
				this.Ab[var44] = var41;
				this.xb[var44] = var42;
			}
			
			if (var45 == 3) {
				var40 = var42;
				var42 = var4.e((byte) 99) + var43;
				var43 = var42;
				this.lb[var44] = var40;
				this.Ab[var44] = var41;
				this.xb[var44] = var42;
			}
			
			if (var45 == 4) {
				int var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.e((byte) 104) + var43;
				var43 = var42;
				this.lb[var44] = var40;
				this.Ab[var44] = var46;
				this.xb[var44] = var42;
			}
		}
		
		var4.pointer = var31;
		
		for (var45 = 0; var45 < var11; ++var45) {
			this.O[var45] = 0;
			this.wb[var45] = (short) var4.readShort(71);
			this.rb[var45] = (short) var4.readShort(109);
			this.hb[var45] = (short) var4.readShort(111);
		}
		
		if (this.ab != null) {
			boolean var50 = false;
			
			for (int var47 = 0; var47 < var10; ++var47) {
				int var48 = this.ab[var47] & 255;
				if (var48 != 255) {
					if ((this.wb[var48]) == this.lb[var47] && (this.rb[var48]) == this.Ab[var47] && (this.hb[var48]) == this.xb[var47]) {
						this.ab[var47] = -1;
					} else {
						var50 = true;
					}
				}
			}
			
			if (!var50) {
				this.ab = null;
			}
		}
		
		if (!var3) {
			this.fb = null;
		}
		
		if (!var2) {
			this.X = null;
		}
		
	}
	
	final void k() {
		this.bb = null;
		this.Jb = null;
		this.P = null;
		this.zb = null;
	}
	
	final void l() {
		for (int index = 0; index < this.ob; ++index) {
			this.db[index] = -this.db[index];
			this.R[index] = -this.R[index];
		}
		
		this.j();
	}
	
	final void d(int i, int i1, int i2) {
		for (int index = 0; index < this.ob; ++index) {
			this.db[index] = this.db[index] * i / 128;
			this.jb[index] = this.jb[index] * i1 / 128;
			this.R[index] = this.R[index] * i2 / 128;
		}
		
		this.j();
	}
	
	public static void m() {
		gb = null;
		sb = null;
		mb = null;
		T = null;
	}
	
	final fe b(int i, int i1, int i2, int i3, int i4) {
		return new he(this, i, i1, i2, i3, i4);
	}
	
	final void a(aa aa, int i, int i1, int i2, boolean flag) {
		cb cb = (cb) aa;
		cb.c();
		cb.i();
		++Kb;
		int i3 = 0;
		int[] ints = cb.db;
		int i4 = cb.ob;
		int i5;
		for (int i6 = 0; i6 < this.ob; ++i6) {
			ba ba = this.pb[i6];
			if (ba.e != 0) {
				i5 = this.jb[i6] - i1;
				if (i5 >= cb.nb && i5 <= cb.W) {
					int i7 = this.db[i6] - i;
					if (i7 >= cb.Db && i7 <= cb.Q) {
						int i8 = this.R[i6] - i2;
						if (i8 >= cb.cb && i8 <= cb.Y) {
							for (int i9 = 0; i9 < i4; ++i9) {
								ba ba1 = cb.pb[i9];
								if (i7 == ints[i9] && i8 == cb.R[i9] && i5 == cb.jb[i9] && ba1.e != 0) {
									if (this.Cb == null) {
										this.Cb = new ba[this.ob];
									}
									
									if (cb.Cb == null) {
										cb.Cb = new ba[i4];
									}
									
									ba ba2 = this.Cb[i6];
									if (ba2 == null) {
										ba2 = this.Cb[i6] = new ba(ba);
									}
									
									ba ba3 = cb.Cb[i9];
									if (ba3 == null) {
										ba3 = cb.Cb[i9] = new ba(ba1);
									}
									
									ba2.f += ba1.f;
									ba2.g += ba1.g;
									ba2.anInt_d += ba1.anInt_d;
									ba2.e += ba1.e;
									ba3.f += ba.f;
									ba3.g += ba.g;
									ba3.anInt_d += ba.anInt_d;
									ba3.e += ba.e;
									++i3;
									gb[i6] = Kb;
									sb[i9] = Kb;
								}
							}
						}
					}
				}
			}
		}
		
		if (i3 >= 3 && flag) {
			for (int index = 0; index < this.ib; ++index) {
				if (gb[this.lb[index]] == Kb && gb[this.Ab[index]] == Kb && gb[this.xb[index]] == Kb) {
					if (this.X == null) {
						this.X = new byte[this.ib];
					}
					
					this.X[index] = 2;
				}
			}
			
			for (i5 = 0; i5 < cb.ib; ++i5) {
				if (sb[cb.lb[i5]] == Kb && sb[cb.Ab[i5]] == Kb && sb[cb.xb[i5]] == Kb) {
					if (cb.X == null) {
						cb.X = new byte[cb.ib];
					}
					
					cb.X[i5] = 2;
				}
			}
		}
	}
	
	private cb() {}
	
	private cb(byte[] bytes) {
		if (bytes[bytes.length - 1] == -1 && bytes[bytes.length - 2] == -1) {
			this.a(bytes);
		} else {
			this.b(bytes);
		}
	}
	
	cb(cb[] cbs, int length) {
		boolean flag = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		this.ob = 0;
		this.ib = 0;
		this.Gb = 0;
		this.Fb = -1;
		for (int i = 0; i < length; ++i) {
			cb cb = cbs[i];
			if (cb != null) {
				this.ob += cb.ob;
				this.ib += cb.ib;
				this.Gb += cb.Gb;
				if (cb.Bb != null) {
					flag2 = true;
				} else {
					if (this.Fb == -1) {
						this.Fb = cb.Fb;
					}
					
					if (this.Fb != cb.Fb) {
						flag2 = true;
					}
				}
				
				flag |= cb.X != null;
				flag3 |= cb.Hb != null;
				flag4 |= cb.Jb != null;
				flag5 |= cb.fb != null;
				flag6 |= cb.ab != null;
			}
		}
		
		this.db = new int[this.ob];
		this.jb = new int[this.ob];
		this.R = new int[this.ob];
		this.bb = new int[this.ob];
		this.lb = new int[this.ib];
		this.Ab = new int[this.ib];
		this.xb = new int[this.ib];
		if (flag) {
			this.X = new byte[this.ib];
		}
		
		if (flag2) {
			this.Bb = new byte[this.ib];
		}
		
		if (flag3) {
			this.Hb = new byte[this.ib];
		}
		
		if (flag4) {
			this.Jb = new int[this.ib];
		}
		
		if (flag5) {
			this.fb = new short[this.ib];
		}
		
		if (flag6) {
			this.ab = new byte[this.ib];
		}
		
		this.tb = new short[this.ib];
		if (this.Gb > 0) {
			this.O = new byte[this.Gb];
			this.wb = new short[this.Gb];
			this.rb = new short[this.Gb];
			this.hb = new short[this.Gb];
			this.eb = new short[this.Gb];
			this.yb = new short[this.Gb];
			this.V = new short[this.Gb];
			this.vb = new byte[this.Gb];
			this.Eb = new byte[this.Gb];
			this.U = new byte[this.Gb];
			this.ub = new byte[this.Gb];
			this.S = new byte[this.Gb];
		}
		
		this.ob = 0;
		this.ib = 0;
		this.Gb = 0;
		
		for (int i = 0; i < length; ++i) {
			cb cb = cbs[i];
			if (cb != null) {
				for (int i1 = 0; i1 < cb.ib; ++i1) {
					if (flag && cb.X != null) {
						this.X[this.ib] = cb.X[i1];
					}
					
					if (flag2) {
						if (cb.Bb != null) {
							this.Bb[this.ib] = cb.Bb[i1];
						} else {
							this.Bb[this.ib] = cb.Fb;
						}
					}
					
					if (flag3 && cb.Hb != null) {
						this.Hb[this.ib] = cb.Hb[i1];
					}
					
					if (flag4 && cb.Jb != null) {
						this.Jb[this.ib] = cb.Jb[i1];
					}
					
					if (flag5) {
						if (cb.fb != null) {
							this.fb[this.ib] = cb.fb[i1];
						} else {
							this.fb[this.ib] = -1;
						}
					}
					
					if (flag6) {
						if (cb.ab != null && cb.ab[i1] != -1) {
							this.ab[this.ib] = (byte) (cb.ab[i1] + this.Gb);
						} else {
							this.ab[this.ib] = -1;
						}
					}
					
					this.tb[this.ib] = cb.tb[i1];
					this.lb[this.ib] = this.a(cb, cb.lb[i1]);
					this.Ab[this.ib] = this.a(cb, cb.Ab[i1]);
					this.xb[this.ib] = this.a(cb, cb.xb[i1]);
					++this.ib;
				}
				
				for (int i1 = 0; i1 < cb.Gb; ++i1) {
					byte b = this.O[this.Gb] = cb.O[i1];
					if (b == 0) {
						this.wb[this.Gb] = (short) this.a(cb, cb.wb[i1]);
						this.rb[this.Gb] = (short) this.a(cb, cb.rb[i1]);
						this.hb[this.Gb] = (short) this.a(cb, cb.hb[i1]);
					}
					
					if (b >= 1 && b <= 3) {
						this.wb[this.Gb] = cb.wb[i1];
						this.rb[this.Gb] = cb.rb[i1];
						this.hb[this.Gb] = cb.hb[i1];
						this.eb[this.Gb] = cb.eb[i1];
						this.yb[this.Gb] = cb.yb[i1];
						this.V[this.Gb] = cb.V[i1];
						this.vb[this.Gb] = cb.vb[i1];
						this.Eb[this.Gb] = cb.Eb[i1];
						this.U[this.Gb] = cb.U[i1];
					}
					
					if (b == 2) {
						this.ub[this.Gb] = cb.ub[i1];
						this.S[this.Gb] = cb.S[i1];
					}
					
					++this.Gb;
				}
			}
		}
	}
	
	cb(cb cb, boolean flag, boolean flag2, boolean flag3, boolean unused) {
		this.ob = cb.ob;
		this.ib = cb.ib;
		this.Gb = cb.Gb;
		int index;
		if (flag) {
			this.db = cb.db;
			this.jb = cb.jb;
			this.R = cb.R;
		} else {
			this.db = new int[this.ob];
			this.jb = new int[this.ob];
			this.R = new int[this.ob];
			
			for (index = 0; index < this.ob; ++index) {
				this.db[index] = cb.db[index];
				this.jb[index] = cb.jb[index];
				this.R[index] = cb.R[index];
			}
		}
		
		if (flag2) {
			this.tb = cb.tb;
		} else {
			this.tb = new short[this.ib];
			
			for (index = 0; index < this.ib; ++index) {
				this.tb[index] = cb.tb[index];
			}
		}
		
		if (!flag3 && cb.fb != null) {
			this.fb = new short[this.ib];
			
			for (index = 0; index < this.ib; ++index) {
				this.fb[index] = cb.fb[index];
			}
		} else {
			this.fb = cb.fb;
		}
		
		this.Hb = cb.Hb;
		this.lb = cb.lb;
		this.Ab = cb.Ab;
		this.xb = cb.xb;
		this.X = cb.X;
		this.Bb = cb.Bb;
		this.ab = cb.ab;
		this.Fb = cb.Fb;
		this.O = cb.O;
		this.wb = cb.wb;
		this.rb = cb.rb;
		this.hb = cb.hb;
		this.eb = cb.eb;
		this.yb = cb.yb;
		this.V = cb.V;
		this.vb = cb.vb;
		this.Eb = cb.Eb;
		this.U = cb.U;
		this.ub = cb.ub;
		this.S = cb.S;
		this.bb = cb.bb;
		this.Jb = cb.Jb;
		this.P = cb.P;
		this.zb = cb.zb;
		this.pb = cb.pb;
		this.qb = cb.qb;
		this.Cb = cb.Cb;
		this.Z = cb.Z;
		this.kb = cb.kb;
	}
	
	static {
		T = ec.L;
		gb = new int[10000];
		mb = ec.W;
		sb = new int[10000];
		Kb = 0;
	}
}
