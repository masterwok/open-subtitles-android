package com.masterwok.opensubtitlesandroid


/**
 * Open Subtitles language codes represented as ISO639-2. If a new entry is added,
 * be sure to add it as a constant and to the mapping.
 *
 * See: https://www.opensubtitles.org/addons/export_languages.php
 */
@Suppress("unused", "MemberVisibilityCanBePrivate")
class SubtitleLanguage private constructor() {

    companion object {

        const val Afarafar = "aar"
        const val Afrihili = "afh"
        const val Afrikaans = "afr"
        const val AfrotoAsiatic = "afa"
        const val Ainu = "ain"
        const val Akan = "aka"
        const val Akkadian = "akk"
        const val Albanian = "alb"
        const val Aleut = "ale"
        const val AlgonquianLanguages = "alg"
        const val Altaic = "tut"
        const val Amharic = "amh"
        const val ApacheLanguages = "apa"
        const val Arabic = "ara"
        const val Aragonese = "arg"
        const val Aramaic = "arc"
        const val Arapaho = "arp"
        const val Araucanian = "arn"
        const val Arawak = "arw"
        const val Armenian = "arm"
        const val Aromanian = "rup"
        const val Artificial = "art"
        const val Assamese = "asm"
        const val Asturian = "ast"
        const val AthapascanLanguages = "ath"
        const val AustralianLanguages = "aus"
        const val Austronesian = "map"
        const val Avaric = "ava"
        const val Avestan = "ave"
        const val Awadhi = "awa"
        const val Aymara = "aym"
        const val Azerbaijani = "aze"
        const val Balinese = "ban"
        const val Baltic = "bat"
        const val Baluchi = "bal"
        const val Bambara = "bam"
        const val BamilekeLanguages = "bai"
        const val Banda = "bad"
        const val Bantu = "bnt"
        const val Basa = "bas"
        const val Bashkir = "bak"
        const val Basque = "baq"
        const val BatakIndonesia = "btk"
        const val Beja = "bej"
        const val Belarusian = "bel"
        const val Bemba = "bem"
        const val Bengali = "ben"
        const val Berber = "ber"
        const val Bhojpuri = "bho"
        const val Bihari = "bih"
        const val Bikol = "bik"
        const val Bini = "bin"
        const val Bislama = "bis"
        const val Blin = "byn"
        const val Bosnian = "bos"
        const val Braj = "bra"
        const val Breton = "bre"
        const val Buginese = "bug"
        const val Bulgarian = "bul"
        const val Buriat = "bua"
        const val Burmese = "bur"
        const val Caddo = "cad"
        const val Carib = "car"
        const val Catalan = "cat"
        const val Caucasian = "cau"
        const val Cebuano = "ceb"
        const val Celtic = "cel"
        const val CentralAmericanIndian = "cai"
        const val Chagatai = "chg"
        const val ChamicLanguages = "cmc"
        const val Chamorro = "cha"
        const val Chechen = "che"
        const val Cherokee = "chr"
        const val Cheyenne = "chy"
        const val Chibcha = "chb"
        const val Chichewa = "nya"
        const val ChineseSimplified = "chi"
        const val ChineseTraditional = "zht"
        const val ChineseBilingual = "zhe"
        const val ChinookJargon = "chn"
        const val Chipewyan = "chp"
        const val Choctaw = "cho"
        const val ChurchSlavic = "chu"
        const val Chuukese = "chk"
        const val Chuvash = "chv"
        const val ClassicalNewari = "nwc"
        const val Coptic = "cop"
        const val Cornish = "cor"
        const val Corsican = "cos"
        const val Cree = "cre"
        const val Creek = "mus"
        const val CreolesPidgins = "crp"
        const val CreolesPidginsEnglishBased = "cpe"
        const val CreolesPidginsFrenchBased = "cpf"
        const val CreolesPidginsPortuguesetoBased = "cpp"
        const val CrimeanTatar = "crh"
        const val Croatian = "hrv"
        const val CushiticCouchitiquesautresLanguages = "cus"
        const val Czech = "cze"
        const val Dakota = "dak"
        const val Danish = "dan"
        const val Dargwa = "dar"
        const val Dayak = "day"
        const val Delaware = "del"
        const val Dinka = "din"
        const val Divehi = "div"
        const val Dogri = "doi"
        const val Dogrib = "dgr"
        const val Dravidian = "dra"
        const val Duala = "dua"
        const val Dutch = "dut"
        const val DutchMiddleCa1050to1350 = "dum"
        const val Dyula = "dyu"
        const val Dzongkha = "dzo"
        const val Efik = "efi"
        const val EgyptianAncient = "egy"
        const val Ekajuk = "eka"
        const val Elamite = "elx"
        const val English = "eng"
        const val EnglishMiddle1100to1500 = "enm"
        const val EnglishOldCa450to1100 = "ang"
        const val Erzya = "myv"
        const val Esperanto = "epo"
        const val Estonian = "est"
        const val Ewe = "ewe"
        const val Ewondo = "ewo"
        const val Extremaduran = "ext"
        const val Fang = "fan"
        const val Fanti = "fat"
        const val Faroese = "fao"
        const val Fijian = "fij"
        const val Filipino = "fil"
        const val Finnish = "fin"
        const val FinnotoUgrian = "fiu"
        const val Fon = "fon"
        const val French = "fre"
        const val FrenchMiddleCa1400to1600 = "frm"
        const val FrenchOld842toCa1400 = "fro"
        const val Frisian = "fry"
        const val Friulian = "fur"
        const val Fulah = "ful"
        const val Ga = "gaa"
        const val Gaelic = "gla"
        const val Galician = "glg"
        const val Ganda = "lug"
        const val Gayo = "gay"
        const val Gbaya = "gba"
        const val Geez = "gez"
        const val Georgian = "geo"
        const val German = "ger"
        const val GermanMiddleHighCa1050to1500 = "gmh"
        const val GermanOldHighCa750to1050 = "goh"
        const val Germanic = "gem"
        const val Gilbertese = "gil"
        const val Gondi = "gon"
        const val Gorontalo = "gor"
        const val Gothic = "got"
        const val Grebo = "grb"
        const val Greek = "ell"
        const val GreekAncientto1453 = "grc"
        const val Guarani = "grn"
        const val Gujarati = "guj"
        const val Gwichin = "gwi"
        const val Haida = "hai"
        const val Haitian = "hat"
        const val Hausa = "hau"
        const val Hawaiian = "haw"
        const val Hebrew = "heb"
        const val Herero = "her"
        const val Hiligaynon = "hil"
        const val Himachali = "him"
        const val Hindi = "hin"
        const val HiriMotu = "hmo"
        const val Hittite = "hit"
        const val Hmong = "hmn"
        const val Hungarian = "hun"
        const val Hupa = "hup"
        const val Iban = "iba"
        const val Icelandic = "ice"
        const val Ido = "ido"
        const val Igbo = "ibo"
        const val Ijo = "ijo"
        const val Iloko = "ilo"
        const val InariSami = "smn"
        const val Indic = "inc"
        const val IndotoEuropean = "ine"
        const val Indonesian = "ind"
        const val Ingush = "inh"
        const val InterlinguaInternationalAuxiliaryLanguageAssociation = "ina"
        const val Interlingue = "ile"
        const val Inuktitut = "iku"
        const val Inupiaq = "ipk"
        const val Iranian = "ira"
        const val Irish = "gle"
        const val IrishMiddle900to1200 = "mga"
        const val IrishOldto900 = "sga"
        const val IroquoianLanguages = "iro"
        const val Italian = "ita"
        const val Japanese = "jpn"
        const val Javanese = "jav"
        const val JudeotoArabic = "jrb"
        const val JudeotoPersian = "jpr"
        const val Kabardian = "kbd"
        const val Kabyle = "kab"
        const val Kachin = "kac"
        const val Kalaallisut = "kal"
        const val Kalmyk = "xal"
        const val Kamba = "kam"
        const val Kannada = "kan"
        const val Kanuri = "kau"
        const val KaratoKalpak = "kaa"
        const val KarachaytoBalkar = "krc"
        const val Karen = "kar"
        const val Kashmiri = "kas"
        const val Kashubian = "csb"
        const val Kawi = "kaw"
        const val Kazakh = "kaz"
        const val Khasi = "kha"
        const val Khmer = "khm"
        const val Khoisan = "khi"
        const val Khotanese = "kho"
        const val Kikuyu = "kik"
        const val Kimbundu = "kmb"
        const val Kinyarwanda = "kin"
        const val Kirghiz = "kir"
        const val Klingon = "tlh"
        const val Komi = "kom"
        const val Kongo = "kon"
        const val Konkani = "kok"
        const val Korean = "kor"
        const val Kosraean = "kos"
        const val Kpelle = "kpe"
        const val Kru = "kro"
        const val Kuanyama = "kua"
        const val Kumyk = "kum"
        const val Kurdish = "kur"
        const val Kurukh = "kru"
        const val Kutenai = "kut"
        const val Ladino = "lad"
        const val Lahnda = "lah"
        const val Lamba = "lam"
        const val Lao = "lao"
        const val Latin = "lat"
        const val Latvian = "lav"
        const val Lezghian = "lez"
        const val Limburgan = "lim"
        const val Lingala = "lin"
        const val Lithuanian = "lit"
        const val LowGerman = "nds"
        const val Lozi = "loz"
        const val LubatoKatanga = "lub"
        const val LubatoLulua = "lua"
        const val Luiseno = "lui"
        const val LuleSami = "smj"
        const val Lunda = "lun"
        const val LuoKenyaAndTanzania = "luo"
        const val lushai = "lus"
        const val Luxembourgish = "ltz"
        const val Macedonian = "mac"
        const val Madurese = "mad"
        const val Magahi = "mag"
        const val Maithili = "mai"
        const val Makasar = "mak"
        const val Malagasy = "mlg"
        const val Malay = "may"
        const val Malayalam = "mal"
        const val Maltese = "mlt"
        const val Manchu = "mnc"
        const val Mandar = "mdr"
        const val Mandingo = "man"
        const val Manipuri = "mni"
        const val ManoboLanguages = "mno"
        const val Manx = "glv"
        const val Maori = "mao"
        const val Marathi = "mar"
        const val Mari = "chm"
        const val Marshallese = "mah"
        const val Marwari = "mwr"
        const val Masai = "mas"
        const val MayanLanguages = "myn"
        const val Mende = "men"
        const val Mikmaq = "mic"
        const val Minangkabau = "min"
        const val Mirandese = "mwl"
        const val MiscellaneousLanguages = "mis"
        const val Mohawk = "moh"
        const val Moksha = "mdf"
        const val Moldavian = "mol"
        const val MontoKhmer = "mkh"
        const val Mongo = "lol"
        const val Mongolian = "mon"
        const val Montenegrin = "mne"
        const val Mossi = "mos"
        const val MultipleLanguages = "mul"
        const val MundaLanguages = "mun"
        const val Nahuatl = "nah"
        const val Nauru = "nau"
        const val Navajo = "nav"
        const val NdebeleNorth = "nde"
        const val NdebeleSouth = "nbl"
        const val Ndonga = "ndo"
        const val Neapolitan = "nap"
        const val NepalBhasa = "new"
        const val Nepali = "nep"
        const val Nias = "nia"
        const val NigertoKordofanian = "nic"
        const val NilotoSaharan = "ssa"
        const val Niuean = "niu"
        const val Nogai = "nog"
        const val NorseOld = "non"
        const val NorthAmericanIndian = "nai"
        const val NorthernSami = "sme"
        const val NorthernSotho = "nso"
        const val Norwegian = "nor"
        const val NorwegianBokmal = "nob"
        const val NorwegianNynorsk = "nno"
        const val NubianLanguages = "nub"
        const val Nyamwezi = "nym"
        const val Nyankole = "nyn"
        const val Nyoro = "nyo"
        const val Nzima = "nzi"
        const val Occitan = "oci"
        const val Ojibwa = "oji"
        const val Oriya = "ori"
        const val Oromo = "orm"
        const val Osage = "osa"
        const val Ossetian = "oss"
        const val OtomianLanguages = "oto"
        const val Pahlavi = "pal"
        const val Palauan = "pau"
        const val Pali = "pli"
        const val Pampanga = "pam"
        const val Pangasinan = "pag"
        const val Panjabi = "pan"
        const val Papiamento = "pap"
        const val Papuan = "paa"
        const val Persian = "per"
        const val PersianOldCa600to400Bc = "peo"
        const val Philippine = "phi"
        const val Phoenician = "phn"
        const val Pohnpeian = "pon"
        const val Polish = "pol"
        const val Portuguese = "por"
        const val PortugueseBr = "pob"
        const val PortugueseMz = "pom"
        const val PrakritLanguages = "pra"
        const val ProvencalOldto1500 = "pro"
        const val Pushto = "pus"
        const val Quechua = "que"
        const val RaetotoRomance = "roh"
        const val Rajasthani = "raj"
        const val Rapanui = "rap"
        const val Rarotongan = "rar"
        const val Romance = "roa"
        const val Romanian = "rum"
        const val Romany = "rom"
        const val Rundi = "run"
        const val Russian = "rus"
        const val SalishanLanguages = "sal"
        const val SamaritanAramaic = "sam"
        const val SamiLanguages = "smi"
        const val Samoan = "smo"
        const val Sandawe = "sad"
        const val Sango = "sag"
        const val Sanskrit = "san"
        const val Santali = "sat"
        const val Sardinian = "srd"
        const val Sasak = "sas"
        const val Scots = "sco"
        const val Selkup = "sel"
        const val Semitic = "sem"
        const val Serbian = "scc"
        const val Serer = "srr"
        const val Shan = "shn"
        const val Shona = "sna"
        const val SichuanYi = "iii"
        const val Sicilian = "scn"
        const val Sidamo = "sid"
        const val SignLanguages = "sgn"
        const val Siksika = "bla"
        const val Sindhi = "snd"
        const val Sinhalese = "sin"
        const val SinotoTibetan = "sit"
        const val SiouanLanguages = "sio"
        const val SkoltSami = "sms"
        const val SlaveAthapascan = "den"
        const val Slavic = "sla"
        const val Slovak = "slo"
        const val Slovenian = "slv"
        const val Sogdian = "sog"
        const val Somali = "som"
        const val Songhai = "son"
        const val Soninke = "snk"
        const val SorbianLanguages = "wen"
        const val SothoSouthern = "sot"
        const val SouthAmericanIndian = "sai"
        const val SouthernAltai = "alt"
        const val SouthernSami = "sma"
        const val Spanish = "spa"
        const val Sukuma = "suk"
        const val Sumerian = "sux"
        const val Sundanese = "sun"
        const val Susu = "sus"
        const val Swahili = "swa"
        const val Swati = "ssw"
        const val Swedish = "swe"
        const val Syriac = "syr"
        const val Tagalog = "tgl"
        const val Tahitian = "tah"
        const val Tai = "tai"
        const val Tajik = "tgk"
        const val Tamashek = "tmh"
        const val Tamil = "tam"
        const val Tatar = "tat"
        const val Telugu = "tel"
        const val Tereno = "ter"
        const val Tetum = "tet"
        const val Thai = "tha"
        const val Tibetan = "tib"
        const val Tigre = "tig"
        const val Tigrinya = "tir"
        const val Timne = "tem"
        const val Tiv = "tiv"
        const val Tlingit = "tli"
        const val TokPisin = "tpi"
        const val Tokelau = "tkl"
        const val TongaNyasa = "tog"
        const val TongaTongaIslands = "ton"
        const val Tsimshian = "tsi"
        const val Tsonga = "tso"
        const val Tswana = "tsn"
        const val Tumbuka = "tum"
        const val TupiLanguages = "tup"
        const val Turkish = "tur"
        const val TurkishOttoman1500to1928 = "ota"
        const val Turkmen = "tuk"
        const val Tuvalu = "tvl"
        const val Tuvinian = "tyv"
        const val Twi = "twi"
        const val Udmurt = "udm"
        const val Ugaritic = "uga"
        const val Uighur = "uig"
        const val Ukrainian = "ukr"
        const val Umbundu = "umb"
        const val Undetermined = "und"
        const val Urdu = "urd"
        const val Uzbek = "uzb"
        const val Vai = "vai"
        const val Venda = "ven"
        const val Vietnamese = "vie"
        const val Volapuk = "vol"
        const val Votic = "vot"
        const val WakashanLanguages = "wak"
        const val Walamo = "wal"
        const val Walloon = "wln"
        const val Waray = "war"
        const val Washo = "was"
        const val Welsh = "wel"
        const val Wolof = "wol"
        const val Xhosa = "xho"
        const val Yakut = "sah"
        const val Yao = "yao"
        const val Yapese = "yap"
        const val Yiddish = "yid"
        const val Yoruba = "yor"
        const val YupikLanguages = "ypk"
        const val Zande = "znd"
        const val Zapotec = "zap"
        const val Zenaga = "zen"
        const val Zhuang = "zha"
        const val Zulu = "zul"
        const val Zuni = "zun"

        private val languageMapping: HashMap<String, String> by lazy {
            hashMapOf(
                    "Afar, afar" to Afarafar
                    , "Afrihili" to Afrihili
                    , "Afrikaans" to Afrikaans
                    , "Afro-Asiatic (Other)" to AfrotoAsiatic
                    , "Ainu" to Ainu
                    , "Akan" to Akan
                    , "Akkadian" to Akkadian
                    , "Albanian" to Albanian
                    , "Aleut" to Aleut
                    , "Algonquian languages" to AlgonquianLanguages
                    , "Altaic (Other)" to Altaic
                    , "Amharic" to Amharic
                    , "Apache languages" to ApacheLanguages
                    , "Arabic" to Arabic
                    , "Aragonese" to Aragonese
                    , "Aramaic" to Aramaic
                    , "Arapaho" to Arapaho
                    , "Araucanian" to Araucanian
                    , "Arawak" to Arawak
                    , "Armenian" to Armenian
                    , "Aromanian" to Aromanian
                    , "Artificial (Other)" to Artificial
                    , "Assamese" to Assamese
                    , "Asturian" to Asturian
                    , "Athapascan languages" to AthapascanLanguages
                    , "Australian languages" to AustralianLanguages
                    , "Austronesian (Other)" to Austronesian
                    , "Avaric" to Avaric
                    , "Avestan" to Avestan
                    , "Awadhi" to Awadhi
                    , "Aymara" to Aymara
                    , "Azerbaijani" to Azerbaijani
                    , "Balinese" to Balinese
                    , "Baltic (Other)" to Baltic
                    , "Baluchi" to Baluchi
                    , "Bambara" to Bambara
                    , "Bamileke languages" to BamilekeLanguages
                    , "Banda" to Banda
                    , "Bantu (Other)" to Bantu
                    , "Basa" to Basa
                    , "Bashkir" to Bashkir
                    , "Basque" to Basque
                    , "Batak (Indonesia)" to BatakIndonesia
                    , "Beja" to Beja
                    , "Belarusian" to Belarusian
                    , "Bemba" to Bemba
                    , "Bengali" to Bengali
                    , "Berber (Other)" to Berber
                    , "Bhojpuri" to Bhojpuri
                    , "Bihari" to Bihari
                    , "Bikol" to Bikol
                    , "Bini" to Bini
                    , "Bislama" to Bislama
                    , "Blin" to Blin
                    , "Bosnian" to Bosnian
                    , "Braj" to Braj
                    , "Breton" to Breton
                    , "Buginese" to Buginese
                    , "Bulgarian" to Bulgarian
                    , "Buriat" to Buriat
                    , "Burmese" to Burmese
                    , "Caddo" to Caddo
                    , "Carib" to Carib
                    , "Catalan" to Catalan
                    , "Caucasian (Other)" to Caucasian
                    , "Cebuano" to Cebuano
                    , "Celtic (Other)" to Celtic
                    , "Central American Indian (Other)" to CentralAmericanIndian
                    , "Chagatai" to Chagatai
                    , "Chamic languages" to ChamicLanguages
                    , "Chamorro" to Chamorro
                    , "Chechen" to Chechen
                    , "Cherokee" to Cherokee
                    , "Cheyenne" to Cheyenne
                    , "Chibcha" to Chibcha
                    , "Chichewa" to Chichewa
                    , "Chinese (simplified)" to ChineseSimplified
                    , "Chinese (traditional)" to ChineseTraditional
                    , "Chinese bilingual" to ChineseBilingual
                    , "Chinook jargon" to ChinookJargon
                    , "Chipewyan" to Chipewyan
                    , "Choctaw" to Choctaw
                    , "Church Slavic" to ChurchSlavic
                    , "Chuukese" to Chuukese
                    , "Chuvash" to Chuvash
                    , "Classical Newari" to ClassicalNewari
                    , "Coptic" to Coptic
                    , "Cornish" to Cornish
                    , "Corsican" to Corsican
                    , "Cree" to Cree
                    , "Creek" to Creek
                    , "Creoles and pidgins (Other)" to CreolesPidgins
                    , "Creoles and pidgins, English based (Other)" to CreolesPidginsEnglishBased
                    , "Creoles and pidgins, French-based (Other)" to CreolesPidginsFrenchBased
                    , "Creoles and pidgins, Portuguese-based (Other)" to CreolesPidginsPortuguesetoBased
                    , "Crimean Tatar" to CrimeanTatar
                    , "Croatian" to Croatian
                    , "Cushitic (Other)' couchitiques, autres langues" to CushiticCouchitiquesautresLanguages
                    , "Czech" to Czech
                    , "Dakota" to Dakota
                    , "Danish" to Danish
                    , "Dargwa" to Dargwa
                    , "Dayak" to Dayak
                    , "Delaware" to Delaware
                    , "Dinka" to Dinka
                    , "Divehi" to Divehi
                    , "Dogri" to Dogri
                    , "Dogrib" to Dogrib
                    , "Dravidian (Other)" to Dravidian
                    , "Duala" to Duala
                    , "Dutch" to Dutch
                    , "Dutch, Middle (ca.1050-1350)" to DutchMiddleCa1050to1350
                    , "Dyula" to Dyula
                    , "Dzongkha" to Dzongkha
                    , "Efik" to Efik
                    , "Egyptian (Ancient)" to EgyptianAncient
                    , "Ekajuk" to Ekajuk
                    , "Elamite" to Elamite
                    , "English" to English
                    , "English, Middle (1100-1500)" to EnglishMiddle1100to1500
                    , "English, Old (ca.450-1100)" to EnglishOldCa450to1100
                    , "Erzya" to Erzya
                    , "Esperanto" to Esperanto
                    , "Estonian" to Estonian
                    , "Ewe" to Ewe
                    , "Ewondo" to Ewondo
                    , "Extremaduran" to Extremaduran
                    , "Fang" to Fang
                    , "Fanti" to Fanti
                    , "Faroese" to Faroese
                    , "Fijian" to Fijian
                    , "Filipino" to Filipino
                    , "Finnish" to Finnish
                    , "Finno-Ugrian (Other)" to FinnotoUgrian
                    , "Fon" to Fon
                    , "French" to French
                    , "French, Middle (ca.1400-1600)" to FrenchMiddleCa1400to1600
                    , "French, Old (842-ca.1400)" to FrenchOld842toCa1400
                    , "Frisian" to Frisian
                    , "Friulian" to Friulian
                    , "Fulah" to Fulah
                    , "Ga" to Ga
                    , "Gaelic" to Gaelic
                    , "Galician" to Galician
                    , "Ganda" to Ganda
                    , "Gayo" to Gayo
                    , "Gbaya" to Gbaya
                    , "Geez" to Geez
                    , "Georgian" to Georgian
                    , "German" to German
                    , "German, Middle High (ca.1050-1500)" to GermanMiddleHighCa1050to1500
                    , "German, Old High (ca.750-1050)" to GermanOldHighCa750to1050
                    , "Germanic (Other)" to Germanic
                    , "Gilbertese" to Gilbertese
                    , "Gondi" to Gondi
                    , "Gorontalo" to Gorontalo
                    , "Gothic" to Gothic
                    , "Grebo" to Grebo
                    , "Greek" to Greek
                    , "Greek, Ancient (to 1453)" to GreekAncientto1453
                    , "Guarani" to Guarani
                    , "Gujarati" to Gujarati
                    , "Gwich´in" to Gwichin
                    , "Haida" to Haida
                    , "Haitian" to Haitian
                    , "Hausa" to Hausa
                    , "Hawaiian" to Hawaiian
                    , "Hebrew" to Hebrew
                    , "Herero" to Herero
                    , "Hiligaynon" to Hiligaynon
                    , "Himachali" to Himachali
                    , "Hindi" to Hindi
                    , "Hiri Motu" to HiriMotu
                    , "Hittite" to Hittite
                    , "Hmong" to Hmong
                    , "Hungarian" to Hungarian
                    , "Hupa" to Hupa
                    , "Iban" to Iban
                    , "Icelandic" to Icelandic
                    , "Ido" to Ido
                    , "Igbo" to Igbo
                    , "Ijo" to Ijo
                    , "Iloko" to Iloko
                    , "Inari Sami" to InariSami
                    , "Indic (Other)" to Indic
                    , "Indo-European (Other)" to IndotoEuropean
                    , "Indonesian" to Indonesian
                    , "Ingush" to Ingush
                    , "Interlingua (International Auxiliary Entry Association)" to InterlinguaInternationalAuxiliaryLanguageAssociation
                    , "Interlingue" to Interlingue
                    , "Inuktitut" to Inuktitut
                    , "Inupiaq" to Inupiaq
                    , "Iranian (Other)" to Iranian
                    , "Irish" to Irish
                    , "Irish, Middle (900-1200)" to IrishMiddle900to1200
                    , "Irish, Old (to 900)" to IrishOldto900
                    , "Iroquoian languages" to IroquoianLanguages
                    , "Italian" to Italian
                    , "Japanese" to Japanese
                    , "Javanese" to Javanese
                    , "Judeo-Arabic" to JudeotoArabic
                    , "Judeo-Persian" to JudeotoPersian
                    , "Kabardian" to Kabardian
                    , "Kabyle" to Kabyle
                    , "Kachin" to Kachin
                    , "Kalaallisut" to Kalaallisut
                    , "Kalmyk" to Kalmyk
                    , "Kamba" to Kamba
                    , "Kannada" to Kannada
                    , "Kanuri" to Kanuri
                    , "Kara-Kalpak" to KaratoKalpak
                    , "Karachay-Balkar" to KarachaytoBalkar
                    , "Karen" to Karen
                    , "Kashmiri" to Kashmiri
                    , "Kashubian" to Kashubian
                    , "Kawi" to Kawi
                    , "Kazakh" to Kazakh
                    , "Khasi" to Khasi
                    , "Khmer" to Khmer
                    , "Khoisan (Other)" to Khoisan
                    , "Khotanese" to Khotanese
                    , "Kikuyu" to Kikuyu
                    , "Kimbundu" to Kimbundu
                    , "Kinyarwanda" to Kinyarwanda
                    , "Kirghiz" to Kirghiz
                    , "Klingon" to Klingon
                    , "Komi" to Komi
                    , "Kongo" to Kongo
                    , "Konkani" to Konkani
                    , "Korean" to Korean
                    , "Kosraean" to Kosraean
                    , "Kpelle" to Kpelle
                    , "Kru" to Kru
                    , "Kuanyama" to Kuanyama
                    , "Kumyk" to Kumyk
                    , "Kurdish" to Kurdish
                    , "Kurukh" to Kurukh
                    , "Kutenai" to Kutenai
                    , "Ladino" to Ladino
                    , "Lahnda" to Lahnda
                    , "Lamba" to Lamba
                    , "Lao" to Lao
                    , "Latin" to Latin
                    , "Latvian" to Latvian
                    , "Lezghian" to Lezghian
                    , "Limburgan" to Limburgan
                    , "Lingala" to Lingala
                    , "Lithuanian" to Lithuanian
                    , "Low German" to LowGerman
                    , "Lozi" to Lozi
                    , "Luba-Katanga" to LubatoKatanga
                    , "Luba-Lulua" to LubatoLulua
                    , "Luiseno" to Luiseno
                    , "Lule Sami" to LuleSami
                    , "Lunda" to Lunda
                    , "Luo (Kenya and Tanzania)" to LuoKenyaAndTanzania
                    , "lushai" to lushai
                    , "Luxembourgish" to Luxembourgish
                    , "Macedonian" to Macedonian
                    , "Madurese" to Madurese
                    , "Magahi" to Magahi
                    , "Maithili" to Maithili
                    , "Makasar" to Makasar
                    , "Malagasy" to Malagasy
                    , "Malay" to Malay
                    , "Malayalam" to Malayalam
                    , "Maltese" to Maltese
                    , "Manchu" to Manchu
                    , "Mandar" to Mandar
                    , "Mandingo" to Mandingo
                    , "Manipuri" to Manipuri
                    , "Manobo languages" to ManoboLanguages
                    , "Manx" to Manx
                    , "Maori" to Maori
                    , "Marathi" to Marathi
                    , "Mari" to Mari
                    , "Marshallese" to Marshallese
                    , "Marwari" to Marwari
                    , "Masai" to Masai
                    , "Mayan languages" to MayanLanguages
                    , "Mende" to Mende
                    , "Mi'kmaq" to Mikmaq
                    , "Minangkabau" to Minangkabau
                    , "Mirandese" to Mirandese
                    , "Miscellaneous languages" to MiscellaneousLanguages
                    , "Mohawk" to Mohawk
                    , "Moksha" to Moksha
                    , "Moldavian" to Moldavian
                    , "Mon-Khmer (Other)" to MontoKhmer
                    , "Mongo" to Mongo
                    , "Mongolian" to Mongolian
                    , "Montenegrin" to Montenegrin
                    , "Mossi" to Mossi
                    , "Multiple languages" to MultipleLanguages
                    , "Munda languages" to MundaLanguages
                    , "Nahuatl" to Nahuatl
                    , "Nauru" to Nauru
                    , "Navajo" to Navajo
                    , "Ndebele, North" to NdebeleNorth
                    , "Ndebele, South" to NdebeleSouth
                    , "Ndonga" to Ndonga
                    , "Neapolitan" to Neapolitan
                    , "Nepal Bhasa" to NepalBhasa
                    , "Nepali" to Nepali
                    , "Nias" to Nias
                    , "Niger-Kordofanian (Other)" to NigertoKordofanian
                    , "Nilo-Saharan (Other)" to NilotoSaharan
                    , "Niuean" to Niuean
                    , "Nogai" to Nogai
                    , "Norse, Old" to NorseOld
                    , "North American Indian" to NorthAmericanIndian
                    , "Northern Sami" to NorthernSami
                    , "Northern Sotho" to NorthernSotho
                    , "Norwegian" to Norwegian
                    , "Norwegian Bokmal" to NorwegianBokmal
                    , "Norwegian Nynorsk" to NorwegianNynorsk
                    , "Nubian languages" to NubianLanguages
                    , "Nyamwezi" to Nyamwezi
                    , "Nyankole" to Nyankole
                    , "Nyoro" to Nyoro
                    , "Nzima" to Nzima
                    , "Occitan" to Occitan
                    , "Ojibwa" to Ojibwa
                    , "Oriya" to Oriya
                    , "Oromo" to Oromo
                    , "Osage" to Osage
                    , "Ossetian" to Ossetian
                    , "Otomian languages" to OtomianLanguages
                    , "Pahlavi" to Pahlavi
                    , "Palauan" to Palauan
                    , "Pali" to Pali
                    , "Pampanga" to Pampanga
                    , "Pangasinan" to Pangasinan
                    , "Panjabi" to Panjabi
                    , "Papiamento" to Papiamento
                    , "Papuan (Other)" to Papuan
                    , "Persian" to Persian
                    , "Persian, Old (ca.600-400 B.C.)" to PersianOldCa600to400Bc
                    , "Philippine (Other)" to Philippine
                    , "Phoenician" to Phoenician
                    , "Pohnpeian" to Pohnpeian
                    , "Polish" to Polish
                    , "Portuguese" to Portuguese
                    , "Portuguese (BR)" to PortugueseBr
                    , "Portuguese (MZ)" to PortugueseMz
                    , "Prakrit languages" to PrakritLanguages
                    , "Provençal, Old (to 1500)" to ProvencalOldto1500
                    , "Pushto" to Pushto
                    , "Quechua" to Quechua
                    , "Raeto-Romance" to RaetotoRomance
                    , "Rajasthani" to Rajasthani
                    , "Rapanui" to Rapanui
                    , "Rarotongan" to Rarotongan
                    , "Romance (Other)" to Romance
                    , "Romanian" to Romanian
                    , "Romany" to Romany
                    , "Rundi" to Rundi
                    , "Russian" to Russian
                    , "Salishan languages" to SalishanLanguages
                    , "Samaritan Aramaic" to SamaritanAramaic
                    , "Sami languages (Other)" to SamiLanguages
                    , "Samoan" to Samoan
                    , "Sandawe" to Sandawe
                    , "Sango" to Sango
                    , "Sanskrit" to Sanskrit
                    , "Santali" to Santali
                    , "Sardinian" to Sardinian
                    , "Sasak" to Sasak
                    , "Scots" to Scots
                    , "Selkup" to Selkup
                    , "Semitic (Other)" to Semitic
                    , "Serbian" to Serbian
                    , "Serer" to Serer
                    , "Shan" to Shan
                    , "Shona" to Shona
                    , "Sichuan Yi" to SichuanYi
                    , "Sicilian" to Sicilian
                    , "Sidamo" to Sidamo
                    , "Sign Languages" to SignLanguages
                    , "Siksika" to Siksika
                    , "Sindhi" to Sindhi
                    , "Sinhalese" to Sinhalese
                    , "Sino-Tibetan (Other)" to SinotoTibetan
                    , "Siouan languages" to SiouanLanguages
                    , "Skolt Sami" to SkoltSami
                    , "Slave (Athapascan)" to SlaveAthapascan
                    , "Slavic (Other)" to Slavic
                    , "Slovak" to Slovak
                    , "Slovenian" to Slovenian
                    , "Sogdian" to Sogdian
                    , "Somali" to Somali
                    , "Songhai" to Songhai
                    , "Soninke" to Soninke
                    , "Sorbian languages" to SorbianLanguages
                    , "Sotho, Southern" to SothoSouthern
                    , "South American Indian (Other)" to SouthAmericanIndian
                    , "Southern Altai" to SouthernAltai
                    , "Southern Sami" to SouthernSami
                    , "Spanish" to Spanish
                    , "Sukuma" to Sukuma
                    , "Sumerian" to Sumerian
                    , "Sundanese" to Sundanese
                    , "Susu" to Susu
                    , "Swahili" to Swahili
                    , "Swati" to Swati
                    , "Swedish" to Swedish
                    , "Syriac" to Syriac
                    , "Tagalog" to Tagalog
                    , "Tahitian" to Tahitian
                    , "Tai (Other)" to Tai
                    , "Tajik" to Tajik
                    , "Tamashek" to Tamashek
                    , "Tamil" to Tamil
                    , "Tatar" to Tatar
                    , "Telugu" to Telugu
                    , "Tereno" to Tereno
                    , "Tetum" to Tetum
                    , "Thai" to Thai
                    , "Tibetan" to Tibetan
                    , "Tigre" to Tigre
                    , "Tigrinya" to Tigrinya
                    , "Timne" to Timne
                    , "Tiv" to Tiv
                    , "Tlingit" to Tlingit
                    , "Tok Pisin" to TokPisin
                    , "Tokelau" to Tokelau
                    , "Tonga (Nyasa)" to TongaNyasa
                    , "Tonga (Tonga Islands)" to TongaTongaIslands
                    , "Tsimshian" to Tsimshian
                    , "Tsonga" to Tsonga
                    , "Tswana" to Tswana
                    , "Tumbuka" to Tumbuka
                    , "Tupi languages" to TupiLanguages
                    , "Turkish" to Turkish
                    , "Turkish, Ottoman (1500-1928)" to TurkishOttoman1500to1928
                    , "Turkmen" to Turkmen
                    , "Tuvalu" to Tuvalu
                    , "Tuvinian" to Tuvinian
                    , "Twi" to Twi
                    , "Udmurt" to Udmurt
                    , "Ugaritic" to Ugaritic
                    , "Uighur" to Uighur
                    , "Ukrainian" to Ukrainian
                    , "Umbundu" to Umbundu
                    , "Undetermined" to Undetermined
                    , "Urdu" to Urdu
                    , "Uzbek" to Uzbek
                    , "Vai" to Vai
                    , "Venda" to Venda
                    , "Vietnamese" to Vietnamese
                    , "Volapük" to Volapuk
                    , "Votic" to Votic
                    , "Wakashan languages" to WakashanLanguages
                    , "Walamo" to Walamo
                    , "Walloon" to Walloon
                    , "Waray" to Waray
                    , "Washo" to Washo
                    , "Welsh" to Welsh
                    , "Wolof" to Wolof
                    , "Xhosa" to Xhosa
                    , "Yakut" to Yakut
                    , "Yao" to Yao
                    , "Yapese" to Yapese
                    , "Yiddish" to Yiddish
                    , "Yoruba" to Yoruba
                    , "Yupik languages" to YupikLanguages
                    , "Zande" to Zande
                    , "Zapotec" to Zapotec
                    , "Zenaga" to Zenaga
                    , "Zhuang" to Zhuang
                    , "Zulu" to Zulu
            )
        }

        /**
         * Get a list of all of the supported languages.
         */
        @JvmStatic
        val supportedLanguages: List<String>
            get() = languageMapping.keys.toList()

        /**
         * Get the language code of the associated [language].
         */
        @JvmStatic
        fun getCodeByLanguage(language: String): String? = languageMapping[language]

        /**
         * Get the language of the associated language [code].
         */
        @JvmStatic
        fun getLanguageByCode(code: String): String? = languageMapping
                .entries
                .firstOrNull { it.value == code }
                ?.key

    }
}

