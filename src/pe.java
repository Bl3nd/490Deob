abstract class pe {
	
	static int anInt_a;
	static int b;
	static int anInt_c;
	static int d;
	int[] e;
	static int f;
	static int anInt_g;
	static int h;
	private boolean i;
	static int j;
	static int k;
	private int[][] ints_l;
	private int[] ints_m;
	private Object[][] n;
	private boolean o;
	static int anInt_p;
	private int[][] q;
	static ob r = rf.a(40, "null");
	static int s;
	static int t;
	static int u;
	private int[] v;
	int[] w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static md E = new md(32);
	int[] F;
	static int G;
	static int H;
	static int I;
	static int J;
	static int K;
	static int L;
	static int M;
	static int N;
	private int[] O;
	static int P;
	Object[] Q;
	static int R;
	static int S;
	private ab T;
	private ab[] U;
	private int V;
	static ob W = rf.a(40, "Hidden)2use");
	int X;
	static int Y;
	static ob Z;
	static int ab = 128;
	private static ob bb = rf.a(40, "No reply from loginserver)3");
	static ob cb;
	static long[] db;
	
	final byte[] a(int id, int unused) {
		try {
			++J;
			if (this.ints_m.length == 1) {
				return this.a((byte) 95, id, 0);
			} else if (!this.b(id, 0)) {
				return null;
			} else if (~this.ints_m[id] == -2) {
				return this.a((byte) 38, 0, id);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.JA(" + id + ',' + unused + ')');
		}
	}
	
	static void a(byte var0) {
		try {
			qc.vc_v.b((int) 9946);
			++y;
			ee.k.b((int) 9946);
			if (var0 >= -104) {
				a(9, 52, -66, -47, 34, -34, -3, -116, 108, 118);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pe.RA(" + var0 + ')');
		}
	}
	
	final void a(boolean unused, byte unused2, boolean flag) {
		try {
			if (flag) {
				this.v = null;
				this.T = null;
			}
			
			++L;
			this.ints_l = null;
			this.U = null;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pe.CA(" + unused + ',' + unused2 + ',' + flag + ')');
		}
	}
	
	final int[] a(int var1, byte var2) {
		try {
			++B;
			if (!this.b(var1, (int) 0)) {
				return null;
			} else {
				int var3 = -7 % ((var2 - -23) / 37);
				int[] var4 = this.q[var1];
				if (var4 == null) {
					var4 = new int[this.F[var1]];
					
					for (int var5 = 0; ~var5 > ~var4.length; var4[var5] = var5++) {
						;
					}
				}
				
				return var4;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "pe.KA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int b(int id, byte unused) {
		try {
			++s;
			return !this.b(id, 0) ? 0 : this.ints_m[id];
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.QA(" + id + ',' + unused + ')');
		}
	}
	
	final int a(int var1, boolean var2, ob var3) {
		try {
			++b;
			if (!this.b(var1, (int) 0)) {
				return -1;
			} else {
				var3 = var3.c((byte) 41);
				int var4 = this.U[var1].a(var3.c((int) 3529), -67);
				if (!var2) {
					this.a((int) -8, (int) -92);
				}
				
				return !this.a((int) var4, var1, -336) ? -1 : var4;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pe.T(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	private boolean a(int var1, int var2, int var3) {
		try {
			++h;
			if (var3 != -336) {
				this.a(92, -104, -22);
			}
			
			if (var2 >= 0 && ~var1 <= -1 && this.ints_m.length > var2 && this.ints_m[var2] > var1) {
				return true;
			} else if (ig.g) {
				throw new IllegalArgumentException(var2 + "," + var1);
			} else {
				return false;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pe.V(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	void a(int fileId, boolean var2) {
		try {
			if (var2) {
				++C;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.E(" + fileId + ',' + var2 + ')');
		}
	}
	
	final byte[] a(int[] data, int var2, int var3, int fileId) {
		try {
			if (var2 != -2) {
				this.a(6, (byte) -107);
			}
			
			++j;
			if (!this.a(var3, fileId, -336)) {
				return null;
			} else {
				if (this.n[fileId] == null || this.n[fileId][var3] == null) {
					boolean var5 = this.a(data, (byte) -111, fileId);
					if (!var5) {
						this.a(fileId, true);
						var5 = this.a(data, (byte) -124, fileId);
						if (!var5) {
							return null;
						}
					}
				}
				
				byte[] var7 = m.a(false, this.n[fileId][var3], false);
				if (this.i) {
					this.n[fileId][var3] = null;
					if (~this.ints_m[fileId] == -2) {
						this.n[fileId] = null;
					}
				}
				
				return var7;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "pe.W(" + (data != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + fileId + ')');
		}
	}
	
	final void a(int var1, ob var2) {
		try {
			var2 = var2.c((byte) -117);
			if (var1 == 16777215) {
				++M;
				int var3 = this.T.a(var2.c((int) 3529), -99);
				this.e(18965, var3);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.HA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int getLength(int var1) {
		try {
			++anInt_g;
			return this.ints_m.length;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pe.P(" + var1 + ')');
		}
	}
	
	private boolean a(int[] data, byte var2, int fileId) {
		try {
			++u;
			if (!this.b(fileId, 0)) {
				return false;
			} else if (this.Q[fileId] == null) {
				return false;
			} else {
				int var4 = this.F[fileId];
				int[] var5 = this.q[fileId];
				if (var2 >= -109) {
					this.c(12);
				}
				
				if (this.n[fileId] == null) {
					this.n[fileId] = new Object[this.ints_m[fileId]];
				}
				
				Object[] var6 = this.n[fileId];
				boolean var7 = true;
				
				for (int var8 = 0; var4 > var8; ++var8) {
					int var9;
					if (var5 == null) {
						var9 = var8;
					} else {
						var9 = var5[var8];
					}
					
					if (var6[var9] == null) {
						var7 = false;
						break;
					}
				}
				
				if (var7) {
					return true;
				} else {
					byte[] bytes;
					if (data != null && (data[0] != 0 || data[1] != 0 || data[2] != 0 || data[3] != 0)) {
						bytes = m.a(false, this.Q[fileId], true);
						og var10 = new og(bytes);
						var10.xteaDecrypt((byte) 107, 5, data, var10.buffer.length);
					} else {
						bytes = m.a(false, this.Q[fileId], false);
					}
					
					byte[] var25;
					try {
						var25 = kh.a(bytes, 101);
					} catch (RuntimeException var22) {
						assert bytes != null;
						throw bc.a(var22, "T3 - " + (data != null) + "," + fileId + "," + bytes.length + "," + fg.a(false, bytes, bytes.length)
								+ "," + fg.a(false, bytes, -2 + bytes.length) + "," + this.e[fileId] + "," + this.X);
					}
					
					if (this.o) {
						this.Q[fileId] = null;
					}
					
					int var11;
					if (var4 > 1) {
						var11 = var25.length;
						--var11;
						int var12 = 255 & var25[var11];
						var11 -= 4 * var4 * var12;
						og var13 = new og(var25);
						int[] var14 = new int[var4];
						var13.pointer = var11;
						
						int var17;
						for (int var15 = 0; ~var12 < ~var15; ++var15) {
							int var16 = 0;
							
							for (var17 = 0; ~var4 < ~var17; ++var17) {
								var16 += var13.readInt(1029109968);
								var14[var17] += var16;
							}
						}
						
						byte[][] var26 = new byte[var4][];
						
						for (var17 = 0; ~var17 > ~var4; ++var17) {
							var26[var17] = new byte[var14[var17]];
							var14[var17] = 0;
						}
						
						var13.pointer = var11;
						int var18 = 0;
						
						int var20;
						int var21;
						for (int var19 = 0; ~var12 < ~var19; ++var19) {
							var20 = 0;
							
							for (var21 = 0; ~var4 < ~var21; ++var21) {
								var20 += var13.readInt(1029109968);
								p.arrayCopy(var25, var18, var26[var21], var14[var21], var20);
								var18 += var20;
								var14[var21] += var20;
							}
						}
						
						for (var20 = 0; ~var4 < ~var20; ++var20) {
							if (var5 != null) {
								var21 = var5[var20];
							} else {
								var21 = var20;
							}
							
							if (!this.i) {
								var6[var21] = nf.a(true, false, var26[var20]);
							} else {
								var6[var21] = var26[var20];
							}
						}
					} else {
						if (var5 == null) {
							var11 = 0;
						} else {
							var11 = var5[0];
						}
						
						if (!this.i) {
							var6[var11] = nf.a(true, false, var25);
						} else {
							var6[var11] = var25;
						}
					}
					
					return true;
				}
			}
		} catch (RuntimeException var23) {
			throw bc.a(var23, "pe.DA(" + (data != null ? "{...}" : "null") + ',' + var2 + ',' + fileId + ')');
		}
	}
	
	final byte[] a(byte unused, int i, int id) {
		try {
			++k;
			return this.a(null, -2, i, id);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pe.O(" + unused + ',' + i + ',' + id + ')');
		}
	}
	
	final boolean b(int id, int var2) {
		try {
			if (var2 != 0) {
				this.a((byte) -2, (byte[]) null);
			}
			
			++anInt_c;
			if (~id <= -1 && ~this.ints_m.length < ~id && this.ints_m[id] != 0) {
				return true;
			} else if (!ig.g) {
				return false;
			} else {
				throw new IllegalArgumentException(Integer.toString(id));
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.N(" + id + ',' + var2 + ')');
		}
	}
	
	final void a(byte unused, byte[] data) {
		try {
			++f;
			this.X = fg.a(false, data, data.length);
			og class_og = new og(kh.a(data, 114));
			int js5ProtocolNumber = class_og.readUnsignedByte(255);
			if (js5ProtocolNumber != 5 && js5ProtocolNumber != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + js5ProtocolNumber);
			} else {
				int var6 = 0;
				int var7 = -1;
				if (~js5ProtocolNumber <= -7) {
					class_og.readInt(1029109968);
				}
				
				int var5 = class_og.readUnsignedByte(255);
				this.V = class_og.readShort(122);
				this.O = new int[this.V];
				
				for (int var8 = 0; ~var8 > ~this.V; ++var8) {
					this.O[var8] = var6 += class_og.readShort(83);
					if (~this.O[var8] < ~var7) {
						var7 = this.O[var8];
					}
				}
				
				this.ints_m = new int[var7 - -1];
				this.Q = new Object[var7 - -1];
				this.F = new int[var7 + 1];
				this.e = new int[var7 - -1];
				this.q = new int[1 + var7][];
				this.w = new int[var7 - -1];
				this.n = new Object[var7 + 1][];
				int var9;
				int var10;
				if (var5 != 0) {
					this.v = new int[var7 - -1];
					for (var9 = 0; var9 < 1 + var7; ++var9) {
						this.v[var9] = -1;
					}
					
					for (var10 = 0; var10 < this.V; ++var10) {
						this.v[this.O[var10]] = class_og.readInt(1029109968);
					}
					
					this.T = new ab(this.v);
				}
				
				for (var9 = 0; ~var9 > ~this.V; ++var9) {
					this.e[this.O[var9]] = class_og.readInt(1029109968);
				}
				
				for (var10 = 0; this.V > var10; ++var10) {
					this.w[this.O[var10]] = class_og.readInt(1029109968);
				}
				
				for (int var11 = 0; this.V > var11; ++var11) {
					this.F[this.O[var11]] = class_og.readShort(47);
				}
				
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				for (int var12 = 0; var12 < this.V; ++var12) {
					var13 = this.O[var12];
					var6 = 0;
					var15 = -1;
					var14 = this.F[var13];
					this.q[var13] = new int[var14];
					for (var16 = 0; var16 < var14; ++var16) {
						var17 = this.q[var13][var16] = var6 += class_og.readShort(121);
						if (~var15 > ~var17) {
							var15 = var17;
						}
					}
					
					this.ints_m[var13] = 1 + var15;
					if (var14 == var15 - -1) {
						this.q[var13] = null;
					}
				}
				
				if (var5 != 0) {
					this.U = new ab[var7 - -1];
					this.ints_l = new int[1 + var7][];
					
					for (var13 = 0; ~this.V < ~var13; ++var13) {
						var14 = this.O[var13];
						var15 = this.F[var14];
						this.ints_l[var14] = new int[this.ints_m[var14]];
						
						for (var16 = 0; ~var16 > ~this.ints_m[var14]; ++var16) {
							this.ints_l[var14][var16] = -1;
						}
						
						for (var17 = 0; var15 > var17; ++var17) {
							int var18;
							if (this.q[var14] != null) {
								var18 = this.q[var14][var17];
							} else {
								var18 = var17;
							}
							
							this.ints_l[var14][var18] = class_og.readInt(1029109968);
						}
						
						this.U[var14] = new ab(this.ints_l[var14]);
					}
				}
			}
		} catch (RuntimeException var19) {
			throw bc.a(var19, "pe.IA(" + unused + ',' + "{...}" + ')');
		}
	}
	
	final boolean a(boolean unused) {
		try {
			++Y;
			boolean var2 = true;
			int var3 = 0;
			if (this.O.length <= var3) {
				return true;
			} else {
				do {
					int var4 = this.O[var3];
					if (this.Q[var4] == null) {
						this.a(var4, true);
						if (this.Q[var4] == null) {
							var2 = false;
						}
					}
					
					++var3;
				} while (this.O.length > var3);
				
				return var2;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "pe.GA(" + unused + ')');
		}
	}
	
	final boolean c(int id, byte unused) {
		try {
			++A;
			
			if (!this.b(id, 0)) {
				return false;
			} else if (this.Q[id] != null) {
				return true;
			} else {
				this.a(id, true);
				return this.Q[id] != null;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.BA(" + id + ',' + unused + ')');
		}
	}
	
	final byte[] b(int var1, int var2, int var3) {
		try {
			++x;
			if (!this.a((int) var1, var2, -336)) {
				return null;
			} else {
				if (this.n[var2] == null || this.n[var2][var1] == null) {
					boolean var4 = this.a((int[]) null, (byte) -116, var2);
					if (!var4) {
						this.a(var2, true);
						var4 = this.a((int[]) null, (byte) -123, var2);
						if (!var4) {
							return null;
						}
					}
				}
				
				if (var3 != 34) {
					return null;
				} else {
					return m.a(false, this.n[var2][var1], false);
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pe.EA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final int a(byte var1, ob var2) {
		try {
			var2 = var2.c((byte) -127);
			if (var1 >= -114) {
				this.T = null;
			}
			
			int var3 = this.T.a(var2.c(3529), -114);
			++I;
			return !this.b(var3, 0) ? -1 : var3;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.FA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void c(int var1, int var2) {
		try {
			++D;
			if (this.b(var2, 0)) {
				this.n[var2] = null;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.OA(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int b(byte unused) {
		try {
			++H;
			int i = 0;
			int i1 = 0;
			int i2 = 0;
			int i3;
			if (this.Q.length <= i2) {
				return 100;
			} else {
				do {
					if (~this.F[i2] < -1) {
						i1 += this.a((byte) -53, i2);
						i += 100;
					}
					
					++i2;
				} while (this.Q.length > i2);
				
				if (i == 0) {
					return 100;
				} else {
					i3 = i1 * 100 / i;
					return i3;
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "pe.MA(" + unused + ')');
		}
	}
	
	final boolean a(ob class_ob, ob huffman, boolean unused) {
		try {
			++t;
			huffman = huffman.c((byte) -81);
			class_ob = class_ob.c((byte) -110);
			int id = this.T.a(huffman.c(3529), -119);
			if (!this.b(id, 0)) {
				return false;
			} else {
				int i = this.U[id].a(class_ob.c(3529), -86);
				return this.b((byte) 86, id, i);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "pe.U(" + (class_ob != null ? "{...}" : "null") + ',' + (huffman != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			db = null;
			cb = null;
			W = null;
			if (var0 != 18034) {
				Z = null;
			}
			
			Z = null;
			r = null;
			bb = null;
			E = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pe.PA(" + var0 + ')');
		}
	}
	
	int a(byte var1, int var2) {
		try {
			if (var1 != -53) {
				return -7;
			} else {
				++N;
				return !this.b(var2, var1 + 53) ? 0 : (this.Q[var2] != null ? 100 : 0);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.D(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void c(int var1) {
		try {
			int var2 = 0;
			if (var1 == -3628) {
				while (var2 < this.n.length) {
					this.n[var2] = null;
					++var2;
				}
				
				++anInt_p;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pe.AA(" + var1 + ')');
		}
	}
	
	static void a(i var0, int var1, i var2) {
		try {
			++S;
			if (ih.v) {
				ce.a(100, var2, var0);
			} else {
				byte var3;
				if (qb.gameState == 0 || qb.gameState == 5) {
					var3 = 20;
					int var4 = -var3 + 253;
					var0.b(ic.runescapeIsLoadingPleaseWait2, 382, -var3 + 245, 16777215, -1);
					oi.a(230, var4, 304, 34, 9179409);
					oi.a(231, 1 + var4, 302, 32, 0);
					oi.d(232, 2 + var4, 3 * ud.Ab, 30, 9179409);
					oi.d(232 + 3 * ud.Ab, var4 - -2, 300 + -(3 * ud.Ab), 30, 0);
					var0.b(kf.c, 382, 276 + -var3, 16777215, -1);
				}
				
				short var9;
				int var10;
				if (qb.gameState == 20) {
					var9 = 211;
					ph.f.b(-(ph.f.Q / 2) + 382, 271 - ph.f.N / 2);
					var0.b(kf.ob_d, 382, var9, 16776960, 0);
					var10 = var9 + 15;
					var0.b(kf.i, 382, var10, 16776960, 0);
					var10 += 15;
					var0.b(kf.j, 382, var10, 16776960, 0);
					var10 += 15;
					var10 += 10;
					var0.a(wc.a(new ob[] {sc.username_2, nh.a(kf.l)}, -3), 272, var10, 16777215, 0);
					var10 += 15;
					var0.a(wc.a(new ob[] {le.password_2, kf.f.b(true)}, -3), 274, var10, 16777215, 0);
					var10 += 15;
				}
				
				short var11;
				if (qb.gameState == 10) {
					ph.f.b(202, 171);
					short var5;
					if (g.J == 0) {
						var9 = 251;
						var11 = 302;
						var0.b(ni.welcomeToRuneScape2, 382, var9, 16776960, 0);
						var10 = var9 + 30;
						var5 = 291;
						wa.A.b(var11 - 73, -20 + var5);
						var0.a(af.newUser2, var11 + -73, -20 + var5, 144, 40, 16777215, 0, 1, 1, 0);
						var11 = 462;
						wa.A.b(var11 + -73, var5 - 20);
						var0.a(jb.existingUser2, var11 - 73, var5 + -20, 144, 40, 16777215, 0, 1, 1, 0);
					} else if (g.J != 2) {
						if (~g.J == -4) {
							var9 = 236;
							var0.b(sb.createAFreeAccount2, 382, 211, 16776960, 0);
							var0.b(mf.toCreateANewAccountYouNeedTo2, 382, var9, 16777215, 0);
							var11 = 382;
							var10 = var9 + 15;
							var5 = 321;
							var0.b(gi.goBackToTheMainRuneScapeWebpage2, 382, var10, 16777215, 0);
							var10 += 15;
							var0.b(je.andChooseTheCreateAccount2, 382, var10, 16777215, 0);
							var10 += 15;
							var0.b(a.buttonNearTheTopOfThatPage2, 382, var10, 16777215, 0);
							wa.A.b(-73 + var11, -20 + var5);
							var10 += 15;
							var0.b(ea.cancel2, var11, 5 + var5, 16777215, 0);
						}
					} else {
						short var6;
						boolean var12;
						var9 = 211;
						var0.b(kf.ob_d, 382, var9, 16776960, 0);
						var10 = var9 + 15;
						var0.b(kf.i, 382, var10, 16776960, 0);
						var6 = 321;
						var5 = 302;
						var10 += 15;
						var0.b(kf.j, 382, var10, 16776960, 0);
						if (vg.eb == 0 && bi.f % 40 < 20 && lb.nb) {
							var12 = true;
						} else {
							var12 = false;
						}
						var10 += 15;
						var10 += 10;
						var0.a(wc.a(new ob[] {sc.username_2, nh.a(kf.l), var12 ? oe.s : kf.e}, -3), 272, var10, 16777215, 0);
						if (~vg.eb != -2 || bi.f % 40 >= 20 || !lb.nb) {
							var12 = false;
						} else {
							var12 = true;
						}
						var10 += 15;
						var0.a(wc.a(new ob[] {le.password_2, kf.f.b(true), var12 ? oe.s : kf.e}, -3), 274, var10, 16777215, 0);
						var10 += 15;
						wa.A.b(-73 + var5, -20 + var6);
						var0.b(ib.c, var5, var6 - -5, 16777215, 0);
						var5 = 462;
						wa.A.b(var5 + -73, -20 + var6);
						var0.b(ea.cancel2, var5, 5 + var6, 16777215, 0);
					}
				}
				
				if (var1 >= -44) {
					b(56);
				}
				
				if (~qa.F != -2) {
					if (~ld.u < -1) {
						ke.c(-82, ld.u);
						ld.u = 0;
					}
					
					sb.b((byte) -110);
				}
				
				ue.R[ni.S ? 1 : 0].b(725, 463);
				if (~qb.gameState < -6 && ~oc.g != -3 && ~oh.M == -1) {
					if (qc.F == null) {
						qc.F = ef.a(0, (byte) -69, l.cacheFile_8, mi.sl_buttonValue);
					}
					
					if (qc.F != null) {
						var3 = 5;
						byte var13 = 100;
						byte var14 = 35;
						var11 = 463;
						qc.F.b(var3, var11);
						var0.b(wc.a(new ob[] {fi.world2, ed.j, hh.a((byte) 93, rd.P)}, -3), var13 / 2 + var3, -2 + var14 / 2 + var11, 16777215, 0);
						if (c.Y == null) {
							var2.b(la.clickToSwitch2, var13 / 2 + var3, 12 + var14 / 2 + var11, 16777215, 0);
							return;
						}
						
						var2.b(ua.c, var3 + var13 / 2, 12 + (var11 - -(var14 / 2)), 16777215, 0);
					}
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "pe.LA(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean d(int unused, int id) {
		try {
			++z;
			if (this.ints_m.length == 1) {
				return this.b((byte) 105, 0, id);
			} else if (!this.b(id, 0)) {
				return false;
			} else if (this.ints_m[id] == 1) {
				return this.b((byte) 107, id, 0);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.Q(" + unused + ',' + id + ')');
		}
	}
	
	void e(int var1, int var2) {
		try {
			if (var1 != 18965) {
				a(38, -99, -10, -67, 6, -31, -27, -127, -118, 125);
			}
			
			++P;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final byte[] a(ob huffman, int unused, ob class_ob) {
		try {
			huffman = huffman.c((byte) 34);
			class_ob = class_ob.c((byte) 104);
			int var4 = this.T.a(huffman.c(3529), -117);
			++K;
			if (!this.b(var4, 0)) {
				return null;
			} else {
				int var5 = this.U[var4].a(class_ob.c(3529), -60);
				return this.a((byte) 9, var5, var4);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "pe.SA(" + (huffman != null ? "{...}" : "null") + ',' + unused + ',' + (class_ob != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean b(byte unused, int i, int i1) {
		try {
			++anInt_a;
			if (!this.a(i1, i, -336)) {
				return false;
			} else if (this.n[i] != null && this.n[i][i1] != null) {
				return true;
			} else if (this.Q[i] != null) {
				return true;
			} else {
				this.a(i, true);
				return this.Q[i] != null;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pe.S(" + unused + ',' + i + ',' + i1 + ')');
		}
	}
	
	static void a(int var0, ra var1, byte var2, int var3) {
		try {
			++G;
			if (var2 != -120) {
				b((int) -100);
			}
			
			if (se.e == 0 || se.e == 3) {
				var0 -= var1.w / 2;
				var3 -= var1.L / 2;
				int var4 = 2047 & jg.h + ve.anInt_l;
				int var5 = ec.W[var4];
				int var6 = ec.L[var4];
				var5 = (256 + lg.d) * var5 >> 8;
				var6 = var6 * (lg.d - -256) >> 8;
				int var7 = var0 * var5 + var3 * var6 >> 11;
				int var9 = le.T.coordX - -var7 >> 7;
				int var8 = var0 * var6 - var3 * var5 >> 11;
				int var10 = -var8 + le.T.coordY >> 7;
				boolean var11 = qc.a(1, 0, var9, var10, (byte) -108, true, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
				if (var11) {
					af.P.writeByte(70, var3);
					af.P.writeByte(69, var0);
					af.P.d(26894, ve.anInt_l);
					af.P.writeByte(69, 57);
					af.P.writeByte(120, jg.h);
					af.P.writeByte(115, lg.d);
					af.P.writeByte(127, 89);
					af.P.d(26894, le.T.coordX);
					af.P.d(var2 + 27014, le.T.coordY);
					af.P.writeByte(84, bd.U);
					af.P.writeByte(100, 63);
				}
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "pe.NA(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var35 = client.anInt_wb;
		
		try {
			int var10;
			label37:
			{
				if (~var2 == ~var5 && ~var0 == ~var3 && ~var6 == ~var9 && var1 == var8) {
					sb.b(var8, var0, -638213620, var4, var5, var9);
					if (var35 == 0) {
						break label37;
					}
				}
				
				var10 = var5;
				int var11 = var0;
				int var12 = 3 * var5;
				int var14 = 3 * var2;
				int var13 = 3 * var0;
				int var16 = var6 * 3;
				int var15 = 3 * var3;
				int var17 = 3 * var1;
				int var18 = -var16 + (var9 - (-var14 + var5));
				int var19 = var8 + -var17 + var15 - var0;
				int var21 = -var15 + (var17 - var15 - -var13);
				int var20 = var12 + -var14 + -var14 + var16;
				int var23 = -var13 + var15;
				int var22 = var14 + -var12;
				int var24 = 128;
				if (var35 != 0 || ~var24 >= -4097) {
					do {
						int var25 = var24 * var24 >> 12;
						int var26 = var25 * var24 >> 12;
						int var27 = var26 * var18;
						int var29 = var20 * var25;
						int var30 = var21 * var25;
						int var32 = var23 * var24;
						int var31 = var22 * var24;
						int var33 = (var31 + var29 + var27 >> 12) + var5;
						int var28 = var26 * var19;
						int var34 = var0 + (var32 + (var28 - -var30) >> 12);
						sb.b(var34, var11, -638213620, var4, var10, var33);
						var11 = var34;
						var10 = var33;
						var24 += 128;
					} while (~var24 >= -4097);
				}
			}
			
			++R;
			var10 = -38 % ((var7 - 19) / 49);
		} catch (RuntimeException var36) {
			throw bc.a(var36, "pe.R(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	pe(boolean var1, boolean var2) {
		try {
			this.o = var1;
			this.i = var2;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "pe.<init>(" + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		cb = bb;
		Z = rf.a(40, "Verbindung abgebrochen)3");
		db = new long[100];
	}
}
