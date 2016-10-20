final class bd extends rg {
	
	static ob D = rf.a(40, "<col=40ff00>");
	static int E;
	static int F;
	static ob G = rf.a(40, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");
	static ob H = rf.a(40, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
	static int I = 0;
	static int[] J;
	static int K = -1;
	static int L;
	int M;
	int N;
	static int O;
	private int P = -1;
	private int Q = 0;
	static ob R = rf.a(40, ")1 ");
	int S;
	int T;
	static int U = 0;
	
	final void a(byte unused, og og, int i) {
		int dummy = client.anInt_wb;
		
		try {
			++E;
			
			do {
				int input = og.readUnsignedByte(255);
				if (input == 0) {
					break;
				}
				
				this.a(input, i, (byte) -117, og);
			} while (dummy == 0);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "bd.G(" + unused + ',' + (og != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
	
	static int b(int i, int i1) {
		try {
			return i & i1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "bd.B(" + i + ',' + i1 + ')');
		}
	}
	
	static void f(int unused) {
		try {
			wg.i(-101);
			++O;
			ja.c((byte) 74);
			qa.d(0);
			se.a(-976);
			od.b((byte) 57);
			af.a((byte) 50);
			ih.a(-18802);
			pe.a((byte) -117);
			kg.a((byte) -86);
			tc.b((byte) 89);
			o.a(false);
			sb.j(-127);
			((qa) ec.Z).c(-100);
			ch.S.b(9946);
			cc.cacheFile_0.c(-3628);
			rh.cacheFile_1.c(-3628);
			ad.cacheFile_3.c(-3628);
			hi.cacheFile_4.c(-3628);
			mf.cacheFile_5.c(-3628);
			q.cacheFile_6.c(-3628);
			qa.cacheFile_7.c(-3628);
			l.cacheFile_8.c(-3628);
			fh.cacheFile_10.c(-3628);
			qe.cacheFile_11.c(-3628);
			jg.cacheFile_12.c(-3628);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bd.E(" + unused + ')');
		}
	}
	
	private void a(int input, int unused, byte unused2, og og) {
		int dummy = client.anInt_wb;
		
		try {
			++L;
			if (input != 1) {
				if (input != 2) {
					if (input == 3) {
						og.readShort(111);
					}
				} else {
					this.P = og.readShort(97);
					if (~this.P == -65536) {
						this.P = -1;
					}
				}
			} else {
				this.Q = og.readUnsignedMedInt(-124);
				this.b(this.Q, (byte) -9);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "bd.D(" + input + ',' + unused + ',' + unused2 + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	static boolean b(int i, int i1, int i2) {
		int i3 = ob.Y[i][i1][i2];
		if (i3 == -v.M) {
			return false;
		} else if (i3 == v.M) {
			return true;
		} else {
			int i4 = i1 << 7;
			int i5 = i2 << 7;
			if (ve.a(i4 + 1, la.v[i][i1][i2], i5 + 1) && ve.a(i4 + 128 - 1, la.v[i][i1 + 1][i2], i5 + 1) && ve.a(i4 + 128 - 1, la.v[i][i1 + 1][i2 + 1], i5 + 128 - 1) && ve.a(i4 + 1, la.v[i][i1][i2 + 1], i5 + 128 - 1)) {
				ob.Y[i][i1][i2] = v.M;
				return true;
			} else {
				ob.Y[i][i1][i2] = -v.M;
				return false;
			}
		}
	}
	
	public static void b(byte unused) {
		try {
			J = null;
			D = null;
			R = null;
			G = null;
			H = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bd.C(" + unused + ')');
		}
	}
	
	private void b(int i, byte unused) {
		int dummy = client.anInt_wb;
		
		try {
			++F;
			double d = (double) ((i & 16724020) >> 16) / 256.0D;
			double d1 = (double) (('\ufff9' & i) >> 8) / 256.0D;
			double d2 = (double) (255 & i) / 256.0D;
			double d3 = d;
			double d4 = d;
			if (d < d1) {
				d3 = d1;
			}
			
			if (d2 > d3) {
				d3 = d2;
			}
			
			if (d > d1) {
				d4 = d1;
			}
			
			double d5 = 0.0D;
			double d6 = 0.0D;
			if (d4 > d2) {
				d4 = d2;
			}
			
			double d7 = (d3 + d4) / 2.0D;
			if (d3 != d4) {
				if (d7 < 0.5D) {
					d6 = (d3 - d4) / (d3 + d4);
				}
				
				if (d7 >= 0.5D) {
					d6 = (d3 - d4) / (2.0D - d3 - d4);
				}
				
				if (d3 != d) {
					if (d3 != d1) {
						if (d2 == d3) {
							d5 = (-d1 + d) / (d3 - d4) + 4.0D;
						}
					} else {
						d5 = (-d + d2) / (-d4 + d3) + 2.0D;
					}
				} else {
					d5 = (-d2 + d1) / (-d4 + d3);
				}
			}
			
			d5 /= 6.0D;
			if (d7 > 0.5D) {
				this.N = (int) (512.0D * (1.0D - d7) * d6);
			} else {
				this.N = (int) (d6 * d7 * 512.0D);
			}
			
			this.S = (int) (d6 * 256.0D);
			if (this.S >= 0) {
				if (~this.S < -256) {
					this.S = 255;
				}
			} else {
				this.S = 0;
			}
			
			if (~this.N > -2) {
				this.N = 1;
			}
			
			this.T = (int) (d7 * 256.0D);
			if (this.T < 0) {
				this.T = 0;
			} else if (~this.T < -256) {
				this.T = 255;
			}
			
			this.M = (int) (d5 * (double) this.N);
		} catch (RuntimeException var20) {
			throw bc.a(var20, "bd.F(" + i + ',' + unused + ')');
		}
	}
}
