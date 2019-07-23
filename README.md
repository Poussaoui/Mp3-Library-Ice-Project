# Mp3 Library Ice Project
 Mp3 Library using ZeroC Ice - network interactions 

The contract between client and server using Ice's IDL, Slice.

	module Player{
	sequence<float> son;
		interface arc{
			son findSonByName(string name);
			son findSonById(int id);
			void addSon(int id,string name,son ms);
			void removeSonByName(string name);
			void removeSonById(int id);
		};
		interface dsp{
			son filter(son s);
			son bass(son s, int level);    
		};
	};
