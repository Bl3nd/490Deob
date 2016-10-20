final class ae extends og {
	
	static ob swe = rf.a(40, "swe");//Ib
	private jd isaac;//Jb
	static pe cacheFile15;//Kb
	private int bitPos;//Lb
	static int Mb;
	static int Nb;
	static int Ob;
	static int Pb;
	static int Qb;
	static int[] Rb = new int[500];
	private static ob red_keyword = rf.a(40, "red:");
	static ob runescapeCom = rf.a(40, ")3runescape)3com");
	static int Ub;
	static int Vb;
	static ob noclipCommand = rf.a(40, "::noclip");
	static ob loadedInterfaces2;
	static ob Yb;
	static ob settings;
	private static ob asItWasUsedToBreakOurRules;
	static int anInt_bc;
	static ob sl_arrows;
	static ob asItWasUsedToBreakOurRules2;
	static int ec;
	static int fc;
	static ob red_keyword2;
	private static ob loadedInterfaces;
	
	final void p(int var1, int unused) {
		try {
			System.out.println("Writing opcode: " + var1);
			super.buffer[super.pointer++] = (byte) (this.isaac.readKey((byte) -108) + var1);
			++Ub;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ae.NB(" + var1 + ',' + unused + ')');
		}
	}
	
	public static void i(byte unused) {
		try {
			red_keyword2 = null;
			loadedInterfaces = null;
			swe = null;
			asItWasUsedToBreakOurRules2 = null;
			loadedInterfaces2 = null;
			red_keyword = null;
			noclipCommand = null;
			Yb = null;
			settings = null;
			asItWasUsedToBreakOurRules = null;
			cacheFile15 = null;
			runescapeCom = null;
			sl_arrows = null;
			Rb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ae.MB(" + unused + ')');
		}
	}
	
	final int readBits(int value, int unused) {
		try {
			++anInt_bc;
			int bytePos = this.bitPos >> 3;
			int bitOffset = 8 - (7 & this.bitPos);
			this.bitPos += value;
			int b = 0;
			while (bitOffset < value) {
				b += (be.i[bitOffset] & super.buffer[bytePos++]) << -bitOffset + value;
				value -= bitOffset;
				bitOffset = 8;
			}
			
			if (~bitOffset == ~value) {
				b += be.i[bitOffset] & super.buffer[bytePos];
			} else {
				b += super.buffer[bytePos] >> -value + bitOffset & be.i[value];
			}
			return b;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ae.PB(" + value + ',' + unused + ')');
		}
	}
	
	final void initBITAccess(byte unused) {
		try {
			this.bitPos = 8 * super.pointer;
			++Ob;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ae.LB(" + unused + ')');
		}
	}
	
	ae(int unused) {
		super(5000);
	}
	
	final int bitOFFS(int unused, int packetSize) {
		try {
			++Vb;
			return -this.bitPos + 8 * packetSize;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ae.OB(" + unused + ',' + packetSize + ')');
		}
	}
	
	static int a(int i, int i1, int i2, boolean unused) {
		try {
			++ec;
			return ~(8 & qe.r[i1][i][i2]) != -1 ? 0 : i1 > 0 && (2 & qe.r[1][i][i2]) != 0 ? i1 + -1 : i1;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ae.IB(" + i + ',' + i1 + ',' + i2 + ',' + unused + ')');
		}
	}
	
	static void a(int i, int i1, int i2, byte unused) {
		try {
			ra ra = ue.a(i2, (byte) 56, i);
			++fc;
			if (ra != null && ra.Jb != null) {
				wc wc = new wc();
				wc.E = ra;
				wc.P = ra.Jb;
				wg.a(-103, wc);
			}
			
			mi.S = i2;
			lb.ub = i1;
			pi.k = i;
			g.O = true;
			dg.a(ra, -114);
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ae.QB(" + i + ',' + i1 + ',' + i2 + ',' + unused + ')');
		}
	}
	
	final int isBigOpcode(int unused) {
		try {
			++Nb;
			return super.buffer[super.pointer++] + -this.isaac.readKey((byte) -121) & 0xff;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ae.JB(" + unused + ')');
		}
	}
	
	final void a(int[] seed, int unused) {
		try {
			this.isaac = new jd(seed);
			++Pb;
			if (unused != -3197) {
				noclipCommand = null;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ae.RB(" + (seed != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	final void finishBITAccess(int unused) {
		try {
			super.pointer = (this.bitPos + 7) / 8;
			++Qb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ae.KB(" + unused + ')');
		}
	}
	
	static {
		Yb = red_keyword;
		asItWasUsedToBreakOurRules = rf.a(40, "as it was used to break our rules)3");
		settings = rf.a(40, "settings=");
		sl_arrows = rf.a(40, "sl_arrows");
		loadedInterfaces = rf.a(40, "Loaded interfaces");
		asItWasUsedToBreakOurRules2 = asItWasUsedToBreakOurRules;
		red_keyword2 = red_keyword;
		loadedInterfaces2 = loadedInterfaces;
	}
}
