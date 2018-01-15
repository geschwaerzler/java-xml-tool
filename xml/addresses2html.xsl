<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:addr="http://xmllab.fhv.at/addressbook"
    version="2.0"
>

    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>XMLTool Adresses</title>
            </head>
            <body>
                <xsl:apply-templates select="addr:addressbook/addr:person"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="addr:person">
        <h2 xml:space="preserve">
            <xsl:value-of select="addr:firstname"/>
            <xsl:value-of select="addr:lastname"/>
        </h2>
        <xsl:for-each select="addr:address">
            <p xml:space="preserve">
                <xsl:value-of select="addr:street"/>,
                <xsl:value-of select="addr:zip"/> <xsl:value-of select="addr:city"/><xsl:if test="addr:country">,
                    <b><xsl:value-of select="upper-case(addr:country)"/></b>
                </xsl:if>
            </p>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>