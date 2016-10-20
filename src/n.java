final class n {
	
	static int a;
	static int b;
	static int c;
	static int anInt_d = 3353893;
	static int e;
	static int f;
	private static ob ob_g = rf.a(40, "skill)2");
	static int h;
	static ob i;
	static int j;
	static int k;
	private rg l = new rg();
	static int m;
	
	final void a(rg var1, int var2) {
		try {
			if (var1.u != null) {
				var1.a((byte) 122);
			}
			
			++a;
			var1.w = this.l.w;
			var1.u = this.l;
			var1.u.w = var1;
			var1.w.u = var1;
			int var3 = -93 / ((8 - var2) / 62);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "n.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	static void a(boolean paramBoolean) {//TODO:
		int i18 = client.anInt_wb;
		try {
			c += 1;
			boolean bool = true;
			ai.a(-124, paramBoolean);
			ph.k = 0;
			int n = 0;
			if (i18 != 0) {
			}
			while ((~tf.l.length) < (~n)) {
				if (((~ic.R[n]) != 0) && (tf.l[n] == null)) {
					tf.l[n] = mf.cacheFile_5.a((byte) -117, 0, ic.R[n]);
					if (tf.l[n] == null) {
						bool = false;
						ph.k += 1;
					}
				}
				if ((qh.e[n] != -1) && (rc.bytes_e[n] == null)) {
					rc.bytes_e[n] = mf.cacheFile_5.a(la.z[n], -2, 0, qh.e[n]);
					if (rc.bytes_e[n] == null) {
						bool = false;
						ph.k += 1;
					}
				}
				n++;
			}
			if (!bool) {
				cc.K = 1;
				return;
			}
			hh.P = 0;
			bool = true;
			int i1 = 0;
			if (i18 != 0) {
			}
			while ((~tf.l.length) < (~i1)) {
				byte[] arrayOfByte1 = rc.bytes_e[i1];
				if (arrayOfByte1 != null) {
					int i4 = (0xFF & bg.ints_g[i1]) * 64 - ic.entityYPosition;
					int i3 = 64 * (bg.ints_g[i1] >> 8) - ic.entityXPosition;
					if (ef.V) {
						i3 = 10;
						i4 = 10;
					}
					bool &= wc.a(arrayOfByte1, i4, i3, 63);
				}
				i1++;
			}
			if (!bool) {
				cc.K = 2;
				return;
			}
			if (cc.K != 0) {
				fb.a(34414, true, wc.a(new ob[] {sc.loadingPleaseWait2, wf.h}, -3));
			}
			li.c(-5);
			bd.f(109);
			li.c(-5);
			qg.a();
			li.c(-5);
			System.gc();
			int i2 = 0;
			if (i18 != 0) {
			}
			while (i2 < 4) {
				ef.R[i2].a((byte) 126);
				i2++;
			}
			int i3 = 0;
			if (i18 != 0) {
			}
			while ((~i3) > -5) {
				int i4 = 0;
				if (i18 != 0) {
				}
				while ((~i4) > -105) {
					int i5 = 0;
					if (i18 != 0) {
					}
					while ((~i5) > -105) {
						qe.r[i3][i4][i5] = 0;
						i5++;
					}
					i4++;
				}
				i3++;
			}
			li.c(-5);
			ag.a(105);
			int i4 = tf.l.length;
			cc.f(2);
			ai.a(-122, true);
			int i7;
			int i10;
			int i11;
			if (!ef.V) {
				int i5 = 0;
				if (i18 != 0) {
				}
				while (i4 > i5) {
					int i6 = 64 * (bg.ints_g[i5] >> 8) - ic.entityXPosition;
					i7 = 64 * (bg.ints_g[i5] & 0xFF) + -ic.entityYPosition;
					byte[] arrayOfByte2 = tf.l[i5];
					if (arrayOfByte2 != null) {
						li.c(-5);
						jd.a(i6, ci.regionX * 8 + -48, ef.R, -116, arrayOfByte2, i7, 8 * rh.regionY + -48);
					}
					i5++;
				}
				int i6 = 0;
				if (i18 != 0) {
				}
				while ((~i6) > (~i4)) {
					int i8 = 64 * (0xFF & bg.ints_g[i6]) + -ic.entityYPosition;
					i7 = 64 * (bg.ints_g[i6] >> 8) + -ic.entityXPosition;
					byte[] arrayOfByte4 = tf.l[i6];
					if ((arrayOfByte4 == null) && (rh.regionY < 800)) {
						li.c(-5);
						g.a(i7, (byte) 75, 64, 64, i8);
					}
					i6++;
				}
				ai.a(-115, true);
				i7 = 0;
				if (i18 != 0) {
				}
				while (i7 < i4) {
					byte[] arrayOfByte3 = rc.bytes_e[i7];
					if (arrayOfByte3 != null) {
						i10 = 64 * (bg.ints_g[i7] >> 8) - ic.entityXPosition;
						i11 = -ic.entityYPosition + 64 * (bg.ints_g[i7] & 0xFF);
						li.c(-5);
						qf.a(50039, arrayOfByte3, i10, i11, ef.R);
					}
					i7++;
				}
			}
			int i9;
			int i13;
			int i12;
			if (ef.V) {
				int i5 = 0;
				if (i18 != 0) {
				}
				int i14;
				int i15;
				int i16;
				while (i5 < 4) {
					li.c(-5);
					int i6 = 0;
					if (i18 != 0) {
					}
					while ((~i6) > -14) {
						i7 = 0;
						if (i18 != 0) {
						}
						while ((~i7) > -14) {
							i9 = 0;
							i10 = lg.ints_p[i5][i6][i7];
							if ((~i10) != 0) {
								i13 = (0xFFE3D9 & i10) >> 14;
								i12 = (0x7 & i10) >> 1;
								i11 = 0x3 & i10 >> 24;
								i14 = i10 >> 3 & 0x7FF;
								i15 = i14 / 8 + (i13 / 8 << 8);
								i16 = 0;
								if (i18 != 0) {
								}
								while (i16 < bg.ints_g.length) {
									if (((~bg.ints_g[i16]) == (~i15)) && (tf.l[i16] != null)) {
										kg.a(8 * (i14 & 0x7), i12, 17606, tf.l[i16], i6 * 8, i5, ef.R, i11, 8 * i7, 8 * (i13 & 0x7));
										i9 = 1;
										if (i18 == 0) {
											break;
										}
									}
									i16++;
								}
							}
							if (i9 == 0) {
								jg.a(i5, 8 * i6, 8, i7 * 8);
							}
							i7++;
						}
						i6++;
					}
					i5++;
				}
				int i6 = 0;
				if (i18 != 0) {
				}
				while ((~i6) > -14) {
					i7 = 0;
					if (i18 != 0) {
					}
					while (i7 < 13) {
						i9 = lg.ints_p[0][i6][i7];
						if ((~i9) == 0) {
							g.a(i6 * 8, (byte) 75, 8, 8, 8 * i7);
						}
						i7++;
					}
					i6++;
				}
				ai.a(-109, true);
				i7 = 0;
				if (i18 != 0) {
				}
				while (i7 < 4) {
					li.c(-5);
					i9 = 0;
					if (i18 != 0) {
					}
					while ((~i9) > -14) {
						i10 = 0;
						if (i18 != 0) {
						}
						while (i10 < 13) {
							i11 = lg.ints_p[i7][i9][i10];
							if (i11 != -1) {
								i12 = i11 >> 24 & 0x3;
								i13 = i11 >> 1 & 0x3;
								i15 = i11 >> 3 & 0x7FF;
								i14 = (0xFFF643 & i11) >> 14;
								i16 = (i14 / 8 << 8) + i15 / 8;
								int i17 = 0;
								if (i18 != 0) {
								}
								while ((~i17) > (~bg.ints_g.length)) {
									if ((i16 == bg.ints_g[i17]) && (rc.bytes_e[i17] != null)) {
										lg.a(ef.R, i10 * 8, (0x7 & i14) * 8, i13, i9 * 8, i12, (0x7 & i15) * 8, rc.bytes_e[i17], i7, 99);
										if (i18 == 0) {
											break;
										}
									}
									i17++;
								}
							}
							i10++;
						}
						i9++;
					}
					i7++;
				}
			}
			ai.a(-121, true);
			bd.f(122);
			li.c(-5);
			wg.a(2210, ef.R);
			ai.a(-120, true);
			int i5 = kd.U;
			if (gf.G < i5) {
				i5 = gf.G;
			}
			if ((~gf.G + -1) < (~i5)) {
				i5 = -1 + gf.G;
			}
			if (ag.forceSend) {
				d.f(kd.U);
				if (i18 == 0) {
				}
			} else {
				d.f(0);
			}
			int i6 = 0;
			if (i18 != 0) {
			}
			while (i6 < 104) {
				i7 = 0;
				if (i18 != 0) {
				}
				while (i7 < 104) {
					ta.c(0, i7, i6);
					i7++;
				}
				i6++;
			}
			li.c(-5);
			bh.c(37);
			bd.f(111);
			if (v.frame != null) {
				af.P.p(43, 12885);
				System.err.println("OUTGOING: Packet 43 " + af.P.pointer);
				ig.d += 1;
				af.P.writeInt(1057001181, (byte) -125);
			}
			if (!ef.V) {
				i7 = (-6 + ci.regionX) / 8;
				i11 = (6 + rh.regionY) / 8;
				i9 = (ci.regionX - -6) / 8;
				i10 = (rh.regionY - 6) / 8;
				i12 = i7 + -1;
				if (i18 != 0) {
				}
				while ((~i9 - -1) <= (~i12)) {
					i13 = i10 + -1;
					if (i18 != 0) {
					}
					while ((~i13) >= (~i11 - -1)) {
						if ((i7 > i12) || ((~i9) > (~i12)) || (i13 < i10) || (i11 < i13)) {
							mf.cacheFile_5.a(16777215, wc.a(new ob[] {lh.m_string, hh.a(93, i12), pc.underscore, hh.a(93, i13)}, -3));
							mf.cacheFile_5.a(16777215, wc.a(new ob[] {ag.l_string, hh.a(93, i12), pc.underscore, hh.a(93, i13)}, -3));
						}
						i13++;
					}
					i12++;
				}
			}
			pg.setGameState(30, (byte) 92);
			li.c(-5);
			dc.a((byte) 105);
			af.P.p(166, 12885);
			System.err.println("OUTGOING: Packet 166 " + af.P.pointer);
			qa.b(32);
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "n.D(" + paramBoolean + ')');
		}
		
	}
	
	final rg a(int var1) {
		try {
			if (var1 != 15843) {
				this.a((byte) 44, null);
			}
			
			++j;
			rg var2 = this.l.w;
			return var2 == this.l ? null : var2;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "n.B(" + var1 + ')');
		}
	}
	
	static final void a(int var0, int var1, ob var2) {
		try {
			++b;
			++ie.v;
			af.P.p(55, 12885);
			af.P.a((byte) 80, var2.e((int) 19790));
			if (var1 >= -4) {
				a(-11, -117, (ob) null);
			}
			
			af.P.a((byte) -72, var0);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "n.F(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(byte unused, rg class_rg) {
		try {
			++m;
			if (class_rg.u != null) {
				class_rg.a((byte) 122);
			}
			
			class_rg.u = this.l.u;
			class_rg.w = this.l;
			class_rg.u.w = class_rg;
			class_rg.w.u = class_rg;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "n.E(" + unused + ',' + "{...}" + ')');
		}
	}
	
	static final ac a(og var0, int var1) {
		try {
			if (var1 < 55) {
				ob_g = null;
			}
			
			++e;
			return new ac(var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readUnsignedMedInt(-124), var0.readUnsignedMedInt(-124), var0.readUnsignedByte(255));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "n.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	final rg a(byte unused) {
		try {
			++h;
			rg class_rg = this.l.w;
			if (this.l == class_rg) {
				return null;
			} else {
				class_rg.a((byte) 122);
				return class_rg;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "n.G(" + unused + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			i = null;
			ob_g = null;
			if (var0 >= -11) {
				a(40, -97, (ob) null);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "n.A(" + var0 + ')');
		}
	}
	
	public n() {
		try {
			this.l.w = this.l;
			this.l.u = this.l;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "n.<init>(" + ')');
		}
	}
	
	static {
		i = ob_g;
		k = 0;
	}
}
