final class cd {
	
	private static ob startingGameEngine = rf.a(40, "Starting game engine)3)3)3");
	static int b;
	static ob startingGameEngine2;
	boolean d;
	int e;
	static int f;
	static int g;
	int h;
	int i;
	static int j;
	int k;
	ob l;
	static ob m;
	static ob[] n;
	
	static bd a(int var0, int var1) {
		try {
			++b;
			if (var0 != -16884) {
				m = null;
			}
			
			bd var2 = (bd) af.D.a((long) var1, (byte) -96);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ka.cacheFile2.a((byte) 48, var1, 1);
				var2 = new bd();
				if (var3 != null) {
					var2.a((byte) -14, new og(var3), var1);
				}
				
				af.D.a(var2, (byte) -61, (long) var1);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "cd.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void a(byte unused) {
		try {
			startingGameEngine2 = null;
			startingGameEngine = null;
			m = null;
			n = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "cd.D(" + unused + ')');
		}
	}
	
	static int a(byte[] data, int length, int unused, int pos) {
		try {
			++j;
			int i2 = -1;
			for (int index = pos; length > index; ++index) {
				i2 = i2 >>> 8 ^ qg.f[0xff & (data[index] ^ i2)];
			}
			
			i2 = ~i2;
			return i2;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "cd.C(" + (data != null ? "{...}" : "null") + ',' + length + ',' + unused + ',' + pos + ')');
		}
	}
	
	static boolean a(int i, int i1, int unused) {
		try {
			++f;
			return ~(i >> i1 + 1 & 1) != -1;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "cd.A(" + i + ',' + i1 + ',' + unused + ')');
		}
	}
	
	static df a(int unused, og og) {
		try {
			++g;
			return new df(og.readSignedShort((byte) -67), og.readSignedShort((byte) -67), og.readSignedShort((byte) -67), og.readSignedShort((byte) -67), og.readUnsignedMedInt(57), og.readUnsignedByte(255));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "cd.B(" + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		startingGameEngine2 = startingGameEngine;
		n = new ob[200];
		m = rf.a(40, "Spieler kann nicht gefunden werden: ");
	}
}
